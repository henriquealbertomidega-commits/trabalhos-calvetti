import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "hazard233";
        System.out.print("Digite a senha: ");
        String SenhaCorreta = sc.nextLine();

        if (SenhaCorreta.equals(senha)) 
            System.out.println("Acesso permitido.");
        else 
            System.out.println("Acesso negado.");
        sc.close();
    }
}
