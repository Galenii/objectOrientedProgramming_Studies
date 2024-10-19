import java.util.Scanner;

public class TesteRetanguloEx7{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        int x4;
        int y4;

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

        System.out.println("Retangulo 2");

        System.out.println("Ponto superior esquerdo");
        System.out.print("  x: ");
        x3 = Integer.parseInt(scan.nextLine());
        System.out.print("  y: ");
        y3 = Integer.parseInt(scan.nextLine());

        System.out.println("Ponto inferior direito");
        System.out.print("  x: ");
        x4 = Integer.parseInt(scan.nextLine());
        System.out.print("  y: ");
        y4 = Integer.parseInt(scan.nextLine());

        Ponto p1 = new Ponto(x1,y1);
        Ponto p2 = new Ponto(x2,y2);
        Ponto p3 = new Ponto(x3,y3);
        Ponto p4 = new Ponto(x4,y4);

        Retangulo r1 = new Retangulo(x1, y1, x2, y2);
        Retangulo r2 = new Retangulo(x3, y3, x4, y4);

        System.out.println("Retangulo 1:");
        System.out.println(r1);

        System.out.println("Retangulo 2:");
        System.out.println(r2);

        if(r1.intersepta(r2)){
            System.out.println("Os retangulos se interceptam? Sim");
        } else {
            System.out.println("Os retangulos se interceptam? Nao");
        }

        scan.close();
    }
}