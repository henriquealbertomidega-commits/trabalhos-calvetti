import java.util.Scanner;
package ConcretoKg;

public class ConcretoKg {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o volume de concreto(m3): ");
    double volume = sc.nextDouble();

    System.out.println("Digite os metros cúbicos (kg por m3): ");
    double consumo = sc.nextDouble();

    double totalCimento = volume * consumo;
    double sacos = totalCimento / 50;

    int sacosRedondo = (int) Math.ceil(sacos);

    System.out.println("Total de cimento necessário: " + totalCimento + "kg");
    System.out.println("Quantidade de sacos (50kg): " + sacosRedondo);

    sc.close();
}
}

