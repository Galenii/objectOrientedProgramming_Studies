import java.util.Scanner;

public class Exercicio1$16 {
    public static void main(String[] args) {
        double base;
        double h;
        double area;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor da base: " );
        base = Double.parseDouble( scan.nextLine() );

        System.out.print( "Valor da altura: " );
        h = Double.parseDouble( scan.nextLine() );

        area = (base*h)/2;

        System.out.printf( "Area = %.2f\n", area );

        scan.close();
    }
}
