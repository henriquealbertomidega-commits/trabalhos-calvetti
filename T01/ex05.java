import java.util.Scanner;   
public class ex05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Entrada de dados
            System.out.print("Qual a distância percorrida (em km): ");
            double distancia = sc.nextDouble();
            System.out.print("Qual a quantidade de combustivel gasto (em litros): ");
            double combustivel = sc.nextDouble();

            // Cálculo do consumo médio
            double consumo = distancia / combustivel;
            System.out.printf("O consumo médio do veículo é: %.2f km/l\n", consumo);
            sc.close();
        }
}
