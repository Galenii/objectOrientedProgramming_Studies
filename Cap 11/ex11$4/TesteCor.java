import java.util.Scanner;

public class TesteCor{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int vermelho;
        int verde;
        int azul;


        System.out.print("Vermelho: ");
        vermelho = Integer.parseInt(scan.nextLine());

        System.out.print("Verde: ");
        verde = Integer.parseInt(scan.nextLine());

        System.out.print("Azul: ");
        azul = Integer.parseInt(scan.nextLine());
        
        Cor c = new Cor( vermelho , verde , azul);

        System.out.print("Cor: ");

        System.out.println( c );
    }
}