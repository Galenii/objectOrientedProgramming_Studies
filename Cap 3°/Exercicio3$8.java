import java.util.Scanner;

public class Exercicio3$8 {
    public static void main(String[] args) {
        int n1;
        int t = 0;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Forneca um numero menor ou igual a zero: ");
        n1 = Integer.parseInt(scan.nextLine());

        if( n1 <= 0){
            for( t = 0 ; t >= n1 ; t--){
                System.out.printf("%d ",t);
            }
        }else{
            System.out.println("Valor incorreto (positivo)");
        }
        scan.close();
    }
}
