import java.util.Scanner;

public class Exercicio1$8 {
   public static void main(String[] args) {
      int l;
      int h;
      int perimetro;
      int area;
      
      Scanner scan = new Scanner ( System.in );

      System.out.print( "Valor da largura: " );
      l = Integer.parseInt( scan.nextLine() );

      System.out.print( "Valor da altura: " );
      h = Integer.parseInt( scan.nextLine() );

      perimetro = (2*l) + (2*h);
      area = l*h;

      System.out.printf("Perimetro = %d\n",perimetro);

      System.out.printf("Area = %d\n",area);

      scan.close();
   } 
}
