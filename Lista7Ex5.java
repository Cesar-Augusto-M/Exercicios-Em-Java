import java.util.Scanner;

public class Lista7Ex5 {
    private String numeroCelular;

    public Lista7Ex5(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String corrigirNumeroCelular() {
        String numeroCorrigido = numeroCelular.replace("-", "").trim();

        if (numeroCorrigido.length() == 8) {
            numeroCorrigido = "9" + numeroCorrigido;
        }

        return formatarNumeroCelular(numeroCorrigido);
    }

    private String formatarNumeroCelular(String numero) {
        return numero.substring(0, 5) + "-" + numero.substring(5, 9);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de telefone celular: ");
        String numero = scanner.nextLine();

        Lista7Ex5 corretor = new Lista7Ex5(numero);
        String numeroCorrigido = corretor.corrigirNumeroCelular();

        System.out.println("Número corrigido: " + numeroCorrigido);
        scanner.close();
    }
}
