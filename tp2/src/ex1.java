import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nomePessoal = leitor.next();
        int tamanhoNomePessoal = nomePessoal.length();

        System.out.println("Digite a sua idade");
        int idade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        String nomeMae = leitor.next();
        int tamanhoNomeMae = nomeMae.length();

        System.out.println("Digite o nome do seu pai: ");
        String nomePai = leitor.next();
        int tamanhoNomePai = nomePai.length();

        if (tamanhoNomePessoal > tamanhoNomePai || tamanhoNomePessoal > tamanhoNomeMae) {
            System.out.println("O nome do filho é maior do que o nome dos pais");
        } else{
            System.out.println("O nome do filho é menor do que o nome dos pais");
        }

    }
}
