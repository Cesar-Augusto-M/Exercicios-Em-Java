import java.util.Scanner;

public class Lista7Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de CPF (formato xxx.xxx.xxx-xx): ");
        String cpf = scanner.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
            scanner.close();
        }
    }

    public static boolean validarCPF(String cpf) {
        
        cpf = cpf.replace(".", "").replace("-", "");

       
        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador >= 10) {
            primeiroDigitoVerificador = 0;
        }

        if (cpf.charAt(9) - '0' != primeiroDigitoVerificador) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador >= 10) {
            segundoDigitoVerificador = 0;
        }

        if (cpf.charAt(10) - '0' != segundoDigitoVerificador) {
            return false;
        }

        return true;
    }
}
