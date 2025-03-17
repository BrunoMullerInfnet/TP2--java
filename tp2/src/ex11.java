import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valor = leitor.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = leitor.nextInt();

        for (int i = valor; ; i += incremento) {
            System.out.print(i);

            if (i > 100) {
                break;
            }

            System.out.print(", ");
        }
    }
}