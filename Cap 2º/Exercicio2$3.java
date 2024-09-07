import java.util.Scanner;

public class Exercicio2$3 {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com um numero: ");
        n1 = Integer.parseInt(scan.nextLine());
        
        System.out.println("Entre com outro numero: ");
        n2 = Integer.parseInt(scan.nextLine());

        if(n2>=n1){
            System.out.printf("Saída Ordem decrescente: %d >= %d",n2,n1);
        } else {
            System.out.printf("Saída Ordem decrescente: %d >= %d",n1,n2);
        }
        scan.close();
    }
    
}
