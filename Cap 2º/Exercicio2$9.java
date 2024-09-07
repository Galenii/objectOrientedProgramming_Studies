import java.util.Scanner;

public class Exercicio2$9 {
    public static void main(String[] args) {
        int ql;
        double medial;
        double area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a quantidade de lados: ");
        ql = Integer.parseInt(scan.nextLine());

        System.out.print("Entre com a medida do lado: ");
        medial = Double.parseDouble(scan.nextLine());

        if(ql == 3){
            area = medial*3;
            System.out.printf("TRIANGULO de perimetro %.2f",area);
        } 
        if(ql == 4){
            area = medial*medial;
            System.out.printf("QUADRADO de area %.2f",area);
        } 
        if(ql == 5){
            System.out.print("PENTAGONO");
        } 
        if (ql < 3){
            System.out.println("Poligono nao identificado");
        }
        if (ql > 5){
            System.out.println("Poligono nao identificado");
        }
        
        scan.close();
    }
}
