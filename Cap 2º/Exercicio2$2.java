import java.util.Scanner;

public class Exercicio2$2 {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner scan = new Scanner ( System.in );


        System.out.println("Entre com um numero: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.println("Entre com outro numero: ");
        n2 = Integer.parseInt(scan.nextLine());


        if(n1<=n2){
            System.out.printf("Ordem crescente: %d <= %d",n1,n2);
        } else {
            System.out.printf("Ordem crescente: %d <= %d",n2,n1);
        }
        scan.close();
    }
}
