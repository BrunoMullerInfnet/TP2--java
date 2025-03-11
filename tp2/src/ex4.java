import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua data de nascimento: ");
        String dataUsuario = leitor.next();

        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento = LocalDate.parse(dataUsuario, forma);

        LocalDate hoje = LocalDate.now();

        long diferencaDias = ChronoUnit.DAYS.between(dataNascimento, hoje);

        System.out.printf("Você já viveu %d dias", diferencaDias);

    }
}
