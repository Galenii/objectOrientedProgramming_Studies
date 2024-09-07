import java.util.Scanner;

public class Exercicio2$1{
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner ( System.in );

        System.out.println("Entre com um numero: ");
        n = Integer.parseInt(scan.nextLine());

        if (n %2==0 ){
            System.out.printf("O numero %d e par.",n);
        } else {
            System.out.printf("O numero %d e impar.",n);
        }
        scan.close();
    }
}