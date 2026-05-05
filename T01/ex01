import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o volume de concreto (m³): ");
        double volume = sc.nextDouble();

        System.out.print("Informe o consumo de cimento (kg por m³): ");
        double consumo = sc.nextDouble();

        // Cálculo do total de cimento necessário
        double totalCimento = volume * consumo;

        // Cálculo da quantidade de sacos (50kg cada)
        double sacos = totalCimento / 50;

        // Arredondar para cima
        int sacosNecessarios = (int) Math.ceil(sacos);

        // Saída
        System.out.println("Total de cimento necessário: " + totalCimento + " kg");
        System.out.println("Quantidade de sacos (50kg): " + sacosNecessarios);

        sc.close();
    }
}
