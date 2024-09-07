import java.util.Scanner;

public class Exercicio1$10 {
    public static void main(String[] args) {
        int bm;
        int b;
        int h;
        int area;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor da base maior: " );
        bm = Integer.parseInt( scan.nextLine() );

        System.out.print( "Valor da base menor: " );
        b = Integer.parseInt( scan.nextLine() );

        System.out.print( "Valor da altura: " );
        h = Integer.parseInt( scan.nextLine() );

        area = ((bm+b)*h)/2;

        System.out.printf( "Area = %d",area );

        scan.close();
    }
    
}