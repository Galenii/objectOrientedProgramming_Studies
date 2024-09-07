import java.util.Scanner;

public class Exercicio2$18 {
    public static void main(String[] args) {
        double n1;
        double n2;
        String op;
        double o = 0;

        Scanner scan = new Scanner (System.in);

        System.out.print("N1: ");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("N2: ");
        n2 = Double.parseDouble(scan.nextLine());

        System.out.print("Escolha uma operacao de acordo com o menu:\n");
        System.out.print("+) Adicao;\n");
        System.out.print("-) Subtracao;\n");
        System.out.print("*) Multiplicacao;\n");
        System.out.print("/) Divisao.\n");
        System.out.print("Operacao: ");
        op = scan.next();

        switch (op) {
            case "+":

            o = n1 + n2 ; 
                System.out.printf("%.2f + %.2f = %.2f\n",n1,n2,o);
                break;
        
            case "-":

            o = n1 - n2;
                System.out.printf("%.2f - %.2f = %.2f\n",n1,n2,o);
            break;

            case "*":
            o = n1 * n2;
                System.out.printf("%.2f * %.2f = %.2f\n",n1,n2,o);
            break;

            case "/":
            o = n1 / n2 ;
                System.out.printf("%.2f / %.2f = %.2f\n",n1,n2,o);
            break;
            
            default:
            System.out.print("Opcao invalida!\n");
                break;
        }
        scan.close();
    }
}
