import java.util.Scanner;

public class Exercicio3$12 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int i;
        int cont = 0;
         
        Scanner scan = new Scanner (System.in);

        System.out.print("N1: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        n2 = Integer.parseInt(scan.nextLine());

        if(n1 >= n2){
            for( i = n2 ; i >= n1 ; i++ ){
                if( i % 2 == 0){
                    cont++;
                }
            }
            System.out.printf("Numeros pares entre %d e %d: %d",n1,n2,cont);
        }    
        if(n1 <= n2){
            for( i = n1 ; i >= n2 ; i++){
                if( i % 2 == 0){
                    cont++;
                }
            }
            System.out.printf("Numeros pares entre %d e %d: %d",n1,n2,cont);
        }
        scan.close();
    }
}
