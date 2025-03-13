import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um ano e descubra se ele é bissexto: ");
        int ano = leitor.nextInt();

        if(ano % 4 == 0){
            System.out.printf("O ano %d é bissexto", ano);
        } else{
            System.out.printf("O ano %d não é bissexto", ano);
        }
    }
}
