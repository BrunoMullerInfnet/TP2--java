import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Descubra o tipo do triângulo pelo tamanho dos seus lados!");

        System.out.println("Digite o tamanho do lado 1: ");
        double l1 = leitor.nextDouble();

        System.out.println("Digite o tamanho do lado 2: ");
        double l2 = leitor.nextDouble();

        System.out.println("Digite o tamanho do lado 3: ");
        double l3 = leitor.nextDouble();

        String triangulo;

        if (l1 == l2 & l2 == l3){
            triangulo = "Equilátero";
        } else if( l1 == l2 | l1 == l3 | l2 == l3){
            triangulo = "Isósceles";
        } else{
            triangulo = "Escaleno";
        }

        System.out.println(triangulo);

    }
}
