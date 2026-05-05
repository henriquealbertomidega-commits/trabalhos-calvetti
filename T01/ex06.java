import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Qual o raio da base: ");
        double raio = sc.nextDouble();
        System.out.print("Qual a altura do cilindro: ");
        double altura = sc.nextDouble();

        // Cálculo do volume
        double volume = Math.PI * raio * raio * altura;
        System.out.printf("O volume do cilindro é: %.2f m³\n", volume);
        sc.close();
    }

}
