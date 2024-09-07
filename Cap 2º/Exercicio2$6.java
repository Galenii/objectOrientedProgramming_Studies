import java.util.Scanner;

public class Exercicio2$6 {
    public static void main(String[] args) {
        double valor;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Entre com um valor: ");
        valor = Double.parseDouble(scan.nextLine());

        if ( valor > 20){
            System.out.printf("A metade de %.2f e %.2f",valor , valor/2);
        } else {
            System.out.printf("O triplo de %.2f e %.2f", valor , valor * 3);
        }
        scan.close();
    }
}
