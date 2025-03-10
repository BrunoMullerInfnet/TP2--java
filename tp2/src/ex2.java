import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota 2");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a nota 3");
        double nota3 = leitor.nextDouble();
        System.out.println("Digite a nota 4");
        double nota4 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >=7){
            System.out.printf("Você foi aprovado!, média %.2f",media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Você está de recuperação, média %.2f",media);
        } else{
            System.out.printf("Você foi reprovado :(, média %.2f",media);
        }
    }
}
