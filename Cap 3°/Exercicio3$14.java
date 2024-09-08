import java.util.Scanner;

public class Exercicio3$14 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int i;
        int temp;
        int soma = 0;


        Scanner scan = new Scanner (System.in);
        
        System.out.print("N1: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        n2 = Integer.parseInt(scan.nextLine());

        if(n1 > n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
            for( i = n1 ; i <= n2 ; i++ ){
                soma = soma + i;
            }
            System.out.printf("Somatorio entre %d e %d: %d",n1,n2,soma);

        scan.close();
    }
}
