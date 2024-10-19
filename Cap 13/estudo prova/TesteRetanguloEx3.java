import java.util.Scanner;

public class TesteRetanguloEx3 {
    public static void main(String[] args) {
        
        int x1;
        int y1;
        int x2;
        int y2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ponto superior esquerdo");
        System.out.print("  x: ");
        x1 = Integer.parseInt(scan.nextLine());
        System.out.print("  y: ");
        y1 = Integer.parseInt(scan.nextLine());

        System.out.println("Ponto inferior direito");
        System.out.print("  x: ");
        x2 = Integer.parseInt(scan.nextLine());
        System.out.print("  y: ");
        y2 = Integer.parseInt(scan.nextLine());

        Ponto p1 = new Ponto(x1,y1);
        Ponto p2 = new Ponto(x2,y2);

        Retangulo r = new Retangulo(p1,p2);
        
        System.out.println("Retangulo criado:");
        System.out.println(r);
        System.out.printf("Area: %.2f" , r.calcularArea());
    }
}
