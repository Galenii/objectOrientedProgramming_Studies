import java.util.Scanner;

public class Exercicio1$22 {
    public static void main(String[] args) {
        double valor;
        
        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor do produto: " );
        valor = Double.parseDouble( scan.nextLine() );

        valor *= .91;
        
        System.out.printf( "Preco de venda com 9%% de desconto: %.2f", valor );

        scan.close();
    }
}
