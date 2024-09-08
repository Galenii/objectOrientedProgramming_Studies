import java.util.Scanner;

public class Exercicio3$9 {
    public static void main(String[] args) {
        int n1;
        int i;
        int temp;


        Scanner scan = new Scanner (System.in);

        System.out.print("Tabuada do Numero: ");
        n1 = Integer.parseInt(scan.nextLine());

        for( i = 0 ; i <= 10 ; i++){
            temp = n1 * i;
            System.out.printf("%d x %d = %d\n",n1 , i , temp);
        }
        scan.close();
    }
}
