import java.util.Scanner;

public class Exercicio2$10 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;

        Scanner scan = new Scanner (System.in);

        System.out.print("a: ");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("b: ");
        n2 = Double.parseDouble(scan.nextLine());

        System.out.print("c: ");
        n3 = Double.parseDouble(scan.nextLine());

        if (n1 == n2 || n1 == n3 || n1 == n3){
            System.out.print("Triangulo EQUILATERO");
        } 
        if (n1 == n2 || n2 == n3 || n1 == n3){
            System.out.print("Triangulo ISOSCELES");
        }
        if (n1 != n2 || n2 != n3 || n1 != n3 ){
            System.out.print("Triangulo ESCALENO");
        }
        if (!== (n1 - n2) < n3 < n1 + n2  (n1 - n3) < n2 < n1 + n3  (n2 - n3) < n1 < n2 + n3){
            System.out.print("As medidas fornecidas dos lados nao representam um triangulo valido!");
        }
        scan.close();
    }
}