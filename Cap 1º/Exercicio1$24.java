import java.util.Scanner;

public class Exercicio1$24 {
    public static void main(String[] args) {
        double hora;
        int aula;
        double inss;
        double salario;

        Scanner scan = new Scanner ( System.in );

        System.out.print( "Valor da hora/aula: " );
        hora = Double.parseDouble( scan.nextLine() );

        System.out.print( "Quantidade de aulas: " );
        aula = Integer.parseInt( scan.nextLine() );

        System.out.print( "Porcentagem de desconto do INSS: " );
        inss = Double.parseDouble( scan.nextLine() );

        inss = inss / 100;
        salario = (hora*aula)-(inss*(hora*aula));

        System.out.printf( "Salario Liquido: %.2f",salario );

        scan.close();
    }
}
