import java.util.Scanner;

public class Lista7Ex4 {
    private static final String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    private static final String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

    public static String converterParaExtenso(int numero) {
        if (numero < 20) {
            return unidades[numero];
        } else {
            int unidade = numero % 10;
            int dezena = numero / 10;
            if (unidade == 0) {
                return dezenas[dezena];
            } else {
                return dezenas[dezena] + " e " + unidades[unidade];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número até 99: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero < 0 || numero > 99) {
            System.out.println("Número inválido. Digite um número entre 0 e 99.");
        } else {
            String numeroExtenso = converterParaExtenso(numero);
            System.out.println("Número por extenso: " + numeroExtenso);
        }
    }
}
