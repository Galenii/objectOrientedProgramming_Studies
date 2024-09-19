import java.util.Scanner;

public class Exercicio7$2 {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner (System.in);

        System.out.print("Raio: ");
        double raio = scan.nextDouble();
        
        double area = areaCirculo(raio);
        double circunferencia = circunferenciaCirculo(raio);
        
        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Circunferencia = %.2f\n", circunferencia);

        scan.close();

    }
    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
    public static double circunferenciaCirculo(double raio) {
        return 2 * Math.PI * raio;
    }
}
