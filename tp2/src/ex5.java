import java.util.Scanner;

public class ex5 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do produto para saber se há desconto: ");
        double valor = leitor.nextDouble();

        if(valor >= 1000){
            double desconto = valor * 0.9;
            System.out.printf("Desconto de 10%% aplicado, valor após o desconto %.2f", desconto);
        } else if (valor >= 500 & valor < 1000){
            double desconto = valor * 0.95;
            System.out.printf("Desconto de 5%% aplicado, valor após o desconto %.2f", desconto);
        } else{
            System.out.println("Não há desconto");
        }
    }
}
