import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto anual: ");
        double salario = leitor.nextDouble();

        double imposto = 0;

        if (salario <= 3000) {
            imposto = 0;
        } else if (salario <= 36000) {
            imposto = (salario - 3000) * 0.080;
        } else if (salario <= 52000) {
            imposto = (salario - 36000) * 0.2 + (36000 - 3000) * 0.080;
        } else if (salario <= 63000) {
            imposto = (salario - 52000) * 0.030 + (52000 - 36000) * 0.2 + (36000 - 3000) * 0.080;
        } else {
            imposto = (salario - 63000 * 0.275 + (60000 - 52000) * 0.030 + (52000 - 36000) * 0.2 + (36000 - 3000) * 0.080);
        }

        System.out.printf("Você pagará %.2f de imposto, seu salário líquido será %.2f", imposto,salario - imposto);

    }
}
