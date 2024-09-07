import java.util.Scanner;

public class Exercicio1$17 {
    public static void main(String[] args) {
        double bm;
        double b;
        double h;
        double area;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor da base maior: " );
        bm = Double.parseDouble(scan.nextLine());
        
        System.out.print( "Valor da base menor: " );
        b = Double.parseDouble( scan.nextLine() );

        System.out.print( "Valor da altura: " );
        h = Double.parseDouble( scan.nextLine() );

        area = ((bm+b)*h)/2;

        System.out.printf( "Area = %.2f", area );

        scan.close();
    }
}
