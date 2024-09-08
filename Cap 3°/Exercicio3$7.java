import java.util.Scanner;

public class Exercicio3$7 {
    public static void main(String[] args) {
        int n1;
        int i = 0;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Forneca um numero menor ou igual a zero: ");
        n1 = Integer.parseInt(scan.nextLine());

        if(n1 <= 0){
            for( i = 0 ; i >= n1 ; n1++ ){
                System.out.printf("%d ",n1);
            }
        }else{
            System.out.println("Valor incorreto (positivo)");
        }
        scan.close();
    }
}
