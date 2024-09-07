import java.util.Scanner;

public class Exercicio1$23 {
    public static void main(String[] args) {
        
    int nasc;
    int atua;
    int apro;

    Scanner scan = new Scanner ( System.in );

    System.out.print( "Ano de nascimento: " );
    nasc = Integer.parseInt( scan.nextLine() );

    System.out.print( "Ano atual: " );
    atua = Integer.parseInt( scan.nextLine() );

    apro = atua-nasc;

    System.out.printf( "Idade aproximada: %d anos",apro );

    scan.close();

    }
}
