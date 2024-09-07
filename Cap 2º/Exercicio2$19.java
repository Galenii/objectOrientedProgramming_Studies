import java.util.Scanner;

public class Exercicio2$19 {
    public static void main(String[] args) {
        double cel;
        double fah;
        String op;
        

        Scanner scan = new Scanner ( System.in );

        System.out.print("Escolha uma operacao de acordo com o menu:\n");
        System.out.print("C) Celsius -> Fahrenheit;\n");
        System.out.print("F) Fahrenheit -> Celsius.\n");
        System.out.print("Opcao: ");
        op = scan.next();

        switch ( op ){
            case "c":
                System.out.print("Entre com a temperatura em graus Celsius: \n");
                cel = Double.parseDouble(scan.nextLine());
                
                fah = (1.8 * cel) + 32;
                
                System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit",cel , fah);
            break;

            case "f":
                System.out.print("Entre com a temperatura em graus Fahrenheit: \n");
                fah = Double.parseDouble(scan.nextLine());

                cel = (fah - 32) / 1.8;

                System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius",fah , cel);
            break;

            default:
                System.out.print("Opcao invalida!");
            break;
        }
        scan.close();
    }

    
}
