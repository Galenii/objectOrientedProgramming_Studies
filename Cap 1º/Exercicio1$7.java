import java.util.Scanner;

public class Exercicio1$7 {
    public static void main(String[] args) {
      
        int l;
        int perimetro;
        int area;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor do lado: ");
        l = Integer.parseInt( scan.nextLine() );

        perimetro = l + l + l + l;
        area = l * l;

        System.out.printf( "Perimetro = %d\n",perimetro );
        System.out.printf( "Area = %d\n",area);

        scan.close();
    }
    
}