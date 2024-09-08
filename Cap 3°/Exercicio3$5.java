import java.util.Scanner;

public class Exercicio3$5 {
    public static void main(String[] args) {
        
        int n1;
        int i = 0;

        Scanner scan = new Scanner (System.in);

        System.out.print("Forneca um numero maior ou igual a zero: ");
        n1 = Integer.parseInt(scan.nextLine());

        if(n1 >= 0){
            for (i = 0; i <= n1; i++){
                System.out.printf("%d ",i);
        }

        } else {
            System.out.println("Valor incorreto (negativo)");
        }
        scan.close();
}
}
