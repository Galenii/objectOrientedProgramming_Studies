import java.util.Scanner;

public class Exercicio2$5 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner scan = new Scanner ( System.in );

        System.out.print("N1: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        n2 = Integer.parseInt(scan.nextLine());

        System.out.print("N4: ");
        n3 = Integer.parseInt(scan.nextLine());

        if( n1 >= n2 && n2 >= n3){
            System.out.printf("%d >= %d >= %d",n1,n2,n3);
        } else if( n2 >= n1 && n1 >= n3){
            System.out.printf("%d >= %d >= %d",n2,n1,n3);
        } else if ( n3 >= n2 && n2 >= n1){
            System.out.printf("%d >= %d >= %d",n3,n2,n1);
        } else if( n2 >= n3 && n3 >= n1){
            System.out.printf("%d >= %d >= %d",n2,n3,n1);
        } else if( n3 >= n1 && n1 >= n2){
            System.out.printf("%d >= %d >= %d",n3,n1,n2);
        } else if( n1 >= n3 && n3 >= n2){
            System.out.printf("%d >= %d >= %d",n1,n3,n2);
        }
        scan.close();
    }
}
