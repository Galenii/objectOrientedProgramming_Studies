import java.util.Scanner;

public class Exercicio3$11 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int i;

        Scanner scan = new Scanner (System.in);

        System.out.printf("N1: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.printf("N2: ");
        n2 = Integer.parseInt(scan.nextLine());
        
        if ( n1 <= n2){
            for( i = n1 ; i <= n2 ; i++){
                System.out.printf("%d ",i);
            }
        } else if (n1 >= n2){
            for ( i = n1 ; i >= n2 ; i--){
                System.out.printf("%d ",i);
            }
        } 

        
        scan.close();
        }
        
    }

