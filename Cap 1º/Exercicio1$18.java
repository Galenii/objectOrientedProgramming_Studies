import java.util.Scanner;

public class Exercicio1$18{
    public static void main(String[] args) {
        double dma;
        double dme;
        double area;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor da diagonal maior: " );
        dma = Double.parseDouble( scan.nextLine() );

        System.out.print( "Valor da diagonal menor: " );
        dme = Double.parseDouble( scan.nextLine() );

        area = (dme*dma)/2;

        System.out.printf( "Area = %.2f",area );

        scan.close();

    }
}