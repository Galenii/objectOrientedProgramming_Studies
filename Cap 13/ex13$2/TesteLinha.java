import java.util.Scanner;

public class TesteLinha {
    
    public static void main(String[] args) {
        
        int xP1;
        int yP1;

        int xP2;
        int yP2;

        Scanner scan = new Scanner( System.in );

        System.out.println( "Ponto inicial" );
        System.out.print( "    x: " );
        xP1 = Integer.parseInt( scan.nextLine() );
        System.out.print( "    y: " );
        yP1 = Integer.parseInt( scan.nextLine() );

        System.out.println( "Ponto final" );
        System.out.print( "    x: " );
        xP2 = Integer.parseInt( scan.nextLine() );
        System.out.print( "    y: " );
        yP2 = Integer.parseInt( scan.nextLine() );

        Ponto p1 = new Ponto( xP1, yP1 );
        Ponto p2 = new Ponto( xP2, yP2 );
        Linha novaLinha = new Linha( p1, p2 );

        System.out.println( "Linha criada: " + novaLinha );
        System.out.printf( "Comprimento: %.2f", novaLinha.calcularComprimento() );

    }

}
