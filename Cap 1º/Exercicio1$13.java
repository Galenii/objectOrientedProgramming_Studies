import java.util.Scanner;

public class Exercicio1$13 {

    public static void main(String[] args) {
        
        double n1;
        double n2;
        double adicao;
        double sub;
        double mult;
        double div;

        Scanner scan = new Scanner ( System.in );


        System.out.printf("Primeiro numero: ");
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.printf("Segundo numero: ");
        n2 = Double.parseDouble( scan.nextLine() );

        adicao = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.printf("%.2f + %.2f = %.2f\n", n1 , n2 , adicao);
        System.out.printf("%.2f - %.2f = %.2f\n", n1 , n2 , sub);
        System.out.printf("%.2f * %.2f = %.2f\n", n1 , n2 , mult);
        System.out.printf("%.2f / %.2f = %.2f\n", n1 , n2 , div);

        scan.close();
    }
    
}
