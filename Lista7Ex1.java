import java.util.Scanner;

public class Lista7Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String 1: ");
        String string1 = scanner.nextLine();
        System.out.print("String 2: ");
        String string2 = scanner.nextLine();

        int tamanhoString1 = string1.length();
        int tamanhoString2 = string2.length();

        if (tamanhoString1 == tamanhoString2) {
            System.out.println("As duas strings têm o mesmo comprimento.");
        } else {
            System.out.println("As duas strings têm comprimentos diferentes.");
        }

        if (string1.equals(string2)) {
            System.out.println("As duas strings têm conteúdo igual.");
        } else {
            System.out.println("As duas strings têm conteúdo diferente.");
        }

        System.out.println("Tamanho de \"" + string1 + "\": " + tamanhoString1 + " caracteres");
        System.out.println("Tamanho de \"" + string2 + "\": " + tamanhoString2 + " caracteres");

        scanner.close();
    }
}
