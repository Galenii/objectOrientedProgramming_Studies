import java.util.Scanner;

public class Exercicio1$20 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int media;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Primeiro numero: " );
        num1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Segundo numero: " );
        num2 = Integer.parseInt( scan.nextLine() );

        media = (num1 + num2)/2;

        System.out.printf( "Media aritmetica: %d", media );

        scan.close();
    }
}
