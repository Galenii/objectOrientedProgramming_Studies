import java.util.Scanner;

public class Exercicio1$21 {
    public static void main(String[] args) {
        int num1;
        int prox;
        int anti;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Forneca um numero inteiro: " );
        num1 = Integer.parseInt( scan.nextLine() );

        prox = num1+1;
        anti = num1-1;

        System.out.printf( "Sucessor de %d: %d\n",num1 , prox );
        System.out.printf( "Antecessor de %d: %d\n",num1 , anti );

        scan.close();
    }
}
