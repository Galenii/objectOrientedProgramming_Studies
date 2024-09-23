import java.util.Scanner;

public class TestePonto {

    public static void main(String[] args) {

        double x;
        double y;
        double x1;
        double y1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ponto 1:");
        System.out.print("  x: ");
        x = Double.parseDouble(scan.nextLine());
        System.out.print("  y:");
        y = Double.parseDouble(scan.nextLine());

        System.out.println("Ponto 2:");
        System.out.print("  x:");
        x1 = Double.parseDouble(scan.nextLine());
        System.out.print("  y:");
        y1 = Double.parseDouble(scan.nextLine());

        Ponto p1 = new Ponto(x, y);
        Ponto p2 = new Ponto(x1, y1);

        System.out.print("Ponto 1:");
        System.out.println( p1 );
        System.out.print("Ponto 2:");
        System.out.print( p2 );

        System.out.printf("\nDistancia entre os pontos: %.2f" , p1.getDistancia(p2));

    }
}
