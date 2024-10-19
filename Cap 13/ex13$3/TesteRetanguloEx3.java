import java.util.Scanner;

public class TesteRetanguloEx3 {
    public static void main(String[] args) {
        
        int p1X ; 
        int p1Y ; 
        int p2X ; 
        int p2Y ; 

        Scanner scan = new Scanner(System.in);

        System.out.println("Ponto superior esquerdo");
        
        System.out.print("  x: ");
        p1X = Integer.parseInt(scan.nextLine());

        System.out.print("  y: ");
        p1Y = Integer.parseInt(scan.nextLine());

        System.out.println("Ponto inferior direito");
        
        System.out.print("  x: ");
        p2X = Integer.parseInt(scan.nextLine());

        System.out.print("  y: ");
        p2Y = Integer.parseInt(scan.nextLine());

        Ponto p1 = new Ponto(p1X , p1Y);
        Ponto p2 = new Ponto(p2X , p2Y);
        Retangulo novRetangulo = new Retangulo(p1 , p2);

        System.out.printf("Retangulo criado: " + novRetangulo );
        System.out.printf("Area: %.2f" , novRetangulo.calcularArea());


    }
}
