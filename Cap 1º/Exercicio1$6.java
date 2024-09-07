import java.util.Scanner;

public class Exercicio1$6 {
    public static void main(String[] args) {

        int n1;
        int n2;
        int adicao;
        int subtracao;
        int multiplicacao;
        int divisao;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Primeiro numero: ");
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Segundo numero: ");
        n2 = Integer.parseInt( scan.nextLine() );

        adicao = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        
        System.out.printf( "%d + %d = %d\n", n1 , n2 , adicao );
        System.out.printf( "%d - %d = %d\n", n1 , n2 , subtracao);
        System.out.printf( "%d * %d = %d\n", n1 , n2 , multiplicacao);
        System.out.printf( "%d / %d = %d\n", n1 , n2 , divisao);
        
        scan.close();
    }
}