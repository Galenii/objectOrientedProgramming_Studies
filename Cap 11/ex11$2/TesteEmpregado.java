import java.util.Scanner;

public class TesteEmpregado {
    public static void main(String[] args) {

        String nome;
        String sobrenome;
        double salario;

        Scanner scan = new Scanner (System.in);
        
        System.out.print("Nome: ");
        nome = scan.nextLine();

        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        
        System.out.print("Salario: ");
        salario = Double.parseDouble(scan.nextLine());

        Empregado e = new Empregado( nome , sobrenome , salario);

        System.out.println( e );
        System.out.println("Aumentando o salario...");

        e.concederAumento();
        System.out.println( e );

        scan.close();
    }
}
