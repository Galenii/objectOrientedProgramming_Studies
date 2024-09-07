import java.util.Scanner;

public class Exercicio2$8 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double temp;

        Scanner scan = new Scanner (System.in);

        System.out.print("N1: ");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("N2: ");
        n2 = Double.parseDouble(scan.nextLine());

        System.out.print("N3: ");
        n3 = Double.parseDouble(scan.nextLine());

        if(n1 > n2){
            temp=n1;
            n1=n2;
            n2=temp;
        } 
        if(n2 > n3){
            temp=n2;
            n2=n3;
            n3=temp;
        }
        if(n1 > n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }

        System.out.printf("A soma dos dois numeros maiores fornecidos e %.2f",n2+n3);
       
        scan.close();
    }   
}
