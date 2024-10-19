import java.util.Scanner;

public class TesteRetanguloEx5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x1;
        int y1;
        int x2;
        int y2;
        int quantidadeX;
        int quantidadeY;

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

        System.out.println("Mover em");
        System.out.print("  x:");
        quantidadeX = Integer.parseInt(scan.nextLine());
        System.out.print("  y:");
        quantidadeY = Integer.parseInt(scan.nextLine());

        Ponto p = new Ponto(x1,y1);
        Ponto p2 = new Ponto(x2,y2);

        Retangulo r = new Retangulo(p, p2);

        System.out.println("Retangulo criado:");
        System.out.println(r);

        System.out.println("Retangulo movido:");
        r.mover(quantidadeX, quantidadeY);
        System.out.println(r);
    }
}
