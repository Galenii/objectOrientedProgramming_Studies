import java.util.Scanner;

public class Exercicio2$7 {
    public static void main(String[] args) {
        double n1;
        double n2;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Entre com um numero: ");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("Entre com outro numero: ");
        n2 = Double.parseDouble(scan.nextLine());

        if (n1+n2>10){
            System.out.printf("Os numeros fornecidos foram %.2f e %.2f",n1,n2);
        } else {
            System.out.printf("A subtracao entre %.2f e %.2f e igual a %.2f",n1,n2,n1-n2);
        }
        scan.close();
    }
}
