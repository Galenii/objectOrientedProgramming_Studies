import java.util.Scanner;

public class Exercicio1$11 {
    public static void main(String[] args) {
        int a;
        int d;
        int dm;

        Scanner scan = new Scanner ( System.in );
        
        System.out.print( "Valor da diagonal maior: " );
        dm = Integer.parseInt( scan.nextLine() );

        System.out.print( "Valor da diagonal menor: " );
        d = Integer.parseInt( scan.nextLine() );

        a = (d*dm)/2;

        System.out.printf( "Area = %d",a );

        scan.close();

    }    
}