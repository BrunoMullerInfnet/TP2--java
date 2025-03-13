import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        String senha = leitor.next();

        System.out.println("Confirme sua senha: ");
        String confirmarSenha = leitor.next();

        while (!confirmarSenha.equals(senha)){
            System.out.println("Senhas diferentes, confirme com a senha criada:");
            confirmarSenha = leitor.next();
        }

        System.out.println("Senha criada com sucesso!");

    }
}
