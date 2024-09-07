import java.util.Scanner;

public class Exercicio1$14 {
    public static void main(String[] args) {
        double l;
        double peri;
        double area;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Valor do lado: ");
        l = Double.parseDouble(scan.nextLine());
        
        peri = l+l+l+l;
        area = l*l;
        
        System.out.printf( "Perimetro = %.2f\n",peri );
        System.out.printf( "Area = %.2f\n",area );
        
        scan.close();
    }
}
