import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Informe a resistência (Ohms): ");
        double resistencia = sc.nextDouble();
        System.out.print("Informe a corrente (Amperes): ");
        double corrente = sc.nextDouble();
        double tensao = corrente * resistencia;
        System.out.println("A tensão é: " + tensao + " Volts");
        sc.close();

    }
}
