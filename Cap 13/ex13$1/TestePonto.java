import java.util.Scanner;

public class TestePonto {
    
    public static void main(String[] args) {
        
        int x;
        int y;
        Scanner scan = new Scanner( System.in );

        System.out.println( "Ponto" );
        System.out.print( "    x: " );
        x = Integer.parseInt( scan.nextLine() );
        System.out.print( "    y: " );
        y = Integer.parseInt( scan.nextLine() );

        Ponto p = new Ponto( x, y );

        System.out.println( "Ponto criado: " + p );

    }

}
