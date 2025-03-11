import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        double brlEur = 0.16;
        double brlGbp = 0.13;
        double brlUsd = 0.17;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double valor = leitor.nextDouble();

        System.out.println("Digite a moeda destino (EUR, GBP, USD): ");
        String moeda = leitor.next().toUpperCase();

        double valorConvertido = 0;

        switch (moeda){
            case "EUR":
                valorConvertido = valor * brlEur;
                System.out.printf("O valor em EUR é: %.2f", valorConvertido);
                break;

            case "GBP":
                valorConvertido = valor * brlGbp;
                System.out.printf("O valor em GBP é: %.2f", valorConvertido);
                break;

            case "USD":
                valorConvertido = valor * brlUsd;
                System.out.printf("O valor em USD é: %.2f", valorConvertido);
                break;

            default:
                System.out.println("Moeda não identificada");
        }

    }
}
