import java.util.Scanner;

public class Lista7Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String nomeInvertido = inverterNome(nome);
        String nomeMaiusculo = nomeInvertido.toUpperCase();

        System.out.println("Nome invertido em maiúsculas: " + nomeMaiusculo);
        scanner.close();
    }

    private static String inverterNome(String nome) {
        StringBuilder builder = new StringBuilder(nome);
        return builder.reverse().toString();
    }
}
