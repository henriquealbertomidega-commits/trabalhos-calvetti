import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite o Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        // Cálculo da conversão
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        // Exibindo o resultado
        System.out.printf("A temperatura em Celsius é %.2f\n", celsius);
        sc.close();
    }
}
