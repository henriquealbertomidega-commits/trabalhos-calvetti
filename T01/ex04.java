import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Qual o capital inicial: ");
        double capital = sc.nextDouble();   
        System.out.print("Qual a taxa de juros mensal (em %): ");
        double taxaJuros = sc.nextDouble() / 100; // Convertendo para decimal
        System.out.print("Qual o número de meses: ");
        int meses = sc.nextInt();
        // Cálculo do montante
        double montante = capital * Math.pow(1 + taxaJuros, meses);
        // Exibindo o resultado
        System.out.printf("O montante acumulado após %d meses é: %.2f\n", meses, montante);
        sc.close();
    }
}
