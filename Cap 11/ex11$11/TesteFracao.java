import java.util.Scanner;

public class TesteFracao {
    public static void main(String[] args) {
        double numerador;
        double denominador;
        double numerador1;
        double denominador1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Fracao 1:"); 

        System.out.print("  numerador: ");
        numerador = Double.parseDouble(scan.nextLine());

        System.out.print("  denominador: ");
        denominador = Double.parseDouble(scan.nextLine());
        
        System.out.println("Fracao 2:"); 

        System.out.print("  numerador: ");
        numerador1 = Double.parseDouble(scan.nextLine());

        System.out.print("  denominador: ");
        denominador1 = Double.parseDouble(scan.nextLine());

        Fracao f1 = new Fracao(numerador, denominador);
        Fracao f2 = new Fracao(numerador1, denominador1);

        
        System.out.println( f1 + " + " + f2 + " = " + f1.somar(f2));
        System.out.println( f1 + " - " + f2 + " = " + f1.subtrair(f2));
        System.out.println( f1 + " * " + f2 + " = " + f1.multiplicar(f2));
        System.out.println( f1 + " / " + f2 + " = " + f1.dividir(f2));
    }
}
