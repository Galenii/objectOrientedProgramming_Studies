import java.util.Scanner;

public class Exercicio2$17 {
    public static void main(String[] args) {
        int n1;

        Scanner scan = new Scanner (System.in);

        System.out.print("Entre com um valor inteiro: ");
        n1 = Integer.parseInt(scan.nextLine());

        switch ( n1 ) {
            case 2: 
                System.out.print("O valor fornecido foi 2.");
                break;
            case 4: 
                System.out.print("O valor fornecido foi 4.");
                break;
            case 6: 
                System.out.print("O valor fornecido foi 6.");
                break;
            case 8: 
                System.out.print("O valor fornecido foi 8.");
                break;
            default :
                System.out.print("Valor invalido.");
        }
            scan.close();
        }
    }

