import java.util.Scanner;

public class Exercicio1$26{
    public static void main(String[] args) {
        double cel;
        double fah;

        Scanner scan = new Scanner(System.in);
        
        System.out.print( "Temperatura em graus Celsius: " );
        cel = Double.parseDouble(scan.nextLine());

        fah = (cel*1.8)+32;

        System.out.printf( "%.2f graus Celsius correspondem a %.2f graus Fahrenheit",cel , fah );
        
        scan.close();
    }
}