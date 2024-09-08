import java.util.Scanner;

public class Exercicio3$13 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int i;

        Scanner scan = new Scanner (System.in);
        
        System.out.print("N1: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        n2 = Integer.parseInt(scan.nextLine());

        if(n1 >= n2){
            for( i = n2 ; i <= n1 ; i++){
                if( i % 2 == 0){
                    cont++;
                }
                if( i % 3 == 0){
                    cont2++;
                }
                if( i % 4 == 0){
                    cont3++;
                }  
            }
            System.out.printf("Multiplos de 2: %d\n",cont);
            System.out.printf("Multiplos de 3: %d\n",cont2);
            System.out.printf("Multiplos de 4: %d\n",cont3);
        }
        if(n1 <= n2){
            for( i = n1 ; i <= n2 ; i++){
                if( i % 2 == 0){
                    cont++;
                }
                if( i % 3 == 0){
                    cont2++;
                }
                if( i % 4 == 0){
                    cont3++;
                }  
            }
            System.out.printf("Multiplos de 2: %d\n",cont);
            System.out.printf("Multiplos de 3: %d\n",cont2);
            System.out.printf("Multiplos de 4: %d\n",cont3);
        }
    }
}
