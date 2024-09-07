import java.util.Scanner;

public class Exercicio1$9 {
    public static void main(String[] args) {
        int h;
        int b;
        int area;
        
        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor da base: " );
        b = Integer.parseInt( scan.nextLine() );

        System.out.print( "Valor da altura: " );
        h = Integer.parseInt( scan.nextLine() );

        area = (b*h)/2;

        System.out.printf( "Area = %d",area );

        scan.close();
    }
}