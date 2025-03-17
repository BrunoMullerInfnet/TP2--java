import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(100) + 1;
        int numeroUsuer = 0;
        int tentativas = 0;

        while (numeroUsuer != numeroAleatorio){
            System.out.println("Advinhe o número: (entre 1 e 100)");
            numeroUsuer = leitor.nextInt();
            tentativas++;

            if (numeroUsuer < numeroAleatorio){
                System.out.println("O numero é maior!");
            } else if (numeroUsuer > numeroAleatorio){
                System.out.println("O numero é menor!");
            }
        }

        System.out.printf("Parabens, você acertou na %d tentativa", tentativas);

    }
}
