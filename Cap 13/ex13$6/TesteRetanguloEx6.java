import java.util.Scanner;

public class TesteRetanguloEx6{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

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

        System.out.println("Ponto");
        System.out.print("  x: ");
        x3 = Integer.parseInt(scan.nextLine());
        System.out.print("  y: ");
        y3 = Integer.parseInt(scan.nextLine());

        Ponto p1 = new Ponto(x1 , y1);
        Ponto p2 = new Ponto(x2 , y2);
        Ponto ponto = new Ponto(x3,y3);

        Retangulo r = new Retangulo(p1 , p2 , ponto);

        System.out.println(r);
        if(r.contem(ponto)){
            System.out.println("O ponto esta contido no retangulo? Sim");
        } else {
            System.out.println("O ponto esta contido no retangulo? Nao");
        }
        
        scan.close();

    }
}