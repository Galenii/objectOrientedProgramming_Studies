import java.util.Scanner;

public class Exercicio2$16 {
    public static void main(String[] args) {
        int n;
        int m;
        int c;
        int d;
        int u;

        Scanner scan = new Scanner ( System.in );

        System.out.print("Entre com um numero entre 1 e 3999: ");
        n = Integer.parseInt(scan.nextLine());
       
        m = n / 1000;
        n = n % 1000;
        c = n / 100;
        n = n % 100;
        d = n / 10;
        u = n % 10;

        if ( m == 1 ){
            System.out.printf("%d = M",n);
        } else if ( m == 2 ){
            System.out.printf("%d = MM",n);
        } else if ( m == 3 ){
            System.out.printf("%d = MMM",n);
        } 
        
        if ( c == 1 ){
            System.out.printf("%d = C",n);
        } else if ( c == 2 ){
            System.out.printf("%d = CC",n);
        } else if ( c == 3 ){
            System.out.printf("%d = CCC",n);
        } else if ( c == 4 ){
            System.out.printf("%d = CCCC",n);
        } else if ( c == 5 ){
            System.out.printf("%d = D",n);
        } else if ( c == 6 ){
            System.out.printf("%d = DC",n);
        } else if ( c == 7 ){
            System.out.printf("%d = DCC",n);
        } else if ( c == 8 ){
            System.out.printf("%d = DCCC",n);
        } else if ( c == 9 ){
            System.out.printf("%d = DCCCC",n);
        } 
        
        if ( d == 1 ){
            System.out.printf("%d = X",n);
        } else if ( d == 2 ){
            System.out.printf("%d = XX",n);
        } else if ( d == 3 ){
            System.out.printf("%d = XXX",n);
        } else if ( d == 4 ){
            System.out.printf("%d = XXXX",n);
        } else if ( d == 5 ){
            System.out.printf("%d = L",n);
        } else if ( d == 6 ){
            System.out.printf("%d = LX",n);
        } else if ( d == 7 ){
            System.out.printf("%d = LXX",n);
        } else if ( d == 8 ){
            System.out.printf("%d = LXX",n);
        } else if ( d == 9 ){
            System.out.printf("%d = LXXXX",n);
        } 
        
        if ( u == 1 ){
            System.out.printf("%d = I",n);
        } else if ( u == 2 ){
            System.out.printf("%d = II",n);
        } else if ( u == 3 ){
            System.out.printf("%d = III",n);
        } else if ( u == 4 ){
            System.out.printf("%d = IV",n);
        } else if ( u == 5 ){
            System.out.printf("%d = V",n);
        } else if ( u == 6 ){
            System.out.printf("%d = VI",n);
        } else if ( u == 7 ){
            System.out.printf("%d = VII",n);
        } else if ( u == 8 ){
            System.out.printf("%d = VIII",n);
        } else if ( u == 9 ){
            System.out.printf("%d = VIIII",n);
        }
        
        
        scan.close();

    }
}
