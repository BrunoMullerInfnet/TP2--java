import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        String[] palavras = texto.split("\\s+");

        int contador = 0;

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                contador++;
            }
        }

        System.out.println("O texto " + contador + " palavras.");
    }
}