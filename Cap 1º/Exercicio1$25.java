import java.util.Scanner;

public class Exercicio1$25 {
    public static void main(String[] args) {
        Double fah;
        Double graus;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Temperatura em graus Fahrenheit: " );
        fah = Double.parseDouble(scan.nextLine());

        graus = (fah - 32)/1.8;

        System.out.printf( "%.2f graus Fahrenheit correspondem a %.2f graus Celsius",fah , graus );
        
        scan.close();
    }
}
