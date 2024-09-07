import java.util.Scanner;

public class Exercicio1$15 {
    public static void main(String[] args) {
        
        double l;
        double h;
        double peri;
        double area;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Valor da largura: ");
        l = Double.parseDouble( scan.nextLine() );

        System.out.print( "Valor de altura: " );
        h = Double.parseDouble( scan.nextLine() );

        peri = (l+l)+(h+h);
        area = l*h;

        System.out.printf( "Perimetro = %.2f\n",peri );
        System.out.printf( "Area = %.2f\n",area );

        scan.close();
    }
}
