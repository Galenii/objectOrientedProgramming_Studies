import java.util.Scanner;

public class Exercicio1$19 {

    public static void main(String[] args) {
        
        Double raio;
        Double diametro;
        Double circunferencia;
        Double area;
        Double pi = 3.141592;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor do raio do circulo: " );
        raio = Double.parseDouble( scan.nextLine() );

        diametro = 2*raio;
        circunferencia = (2*pi*raio);
        area = (pi)*raio*raio;

        System.out.printf( "Diametro = %.2f\n",diametro );
        System.out.printf( "Circunferencia = %.2f\n",circunferencia );
        System.out.printf( "Area = %.2f\n",area );

        scan.close();
    }
    
}
