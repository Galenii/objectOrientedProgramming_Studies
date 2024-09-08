import java.util.Scanner;

public class Exercicio3$6 {
    public static void main(String[] args) {
        
        int n1;
        int t = 0;

        n1 = t;
        t = n1;

        Scanner scan = new Scanner ( System.in );
        
        System.out.print("Forneca um numero maior ou igual a zero: ");
        n1 = Integer.parseInt(scan.nextLine());

        
        if(n1 >= 0){
            for( t = n1 ; 0 <= t ; t--){
                System.out.printf("%d ",t);
            }
        }else{
            System.out.println("Valor incorreto (negativo)");
        }
        scan.close();
    }
}
