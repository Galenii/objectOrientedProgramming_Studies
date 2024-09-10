import java.util.Scanner;

public class Exercicio4$3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Double[] array2 = new Double[5];
        Double soma;
        Double multi;

        Scanner scan = new Scanner (System.in);

        for( int i=0 ; i < array.length ; i++ ){
            System.out.printf("array[%d]: ",i);
            array2 [i] = Double.parseDouble(scan.nextLine());
        }

        multi = 1.00;
        soma = 0.00;

        for( int i=0 ; i < array.length ; i++){
            soma = soma + array2[i];
            multi = multi * array2[i];
        }

        System.out.printf("Somatorio: %.2f\n",soma);
        System.out.printf("Produtorio: %.2f",multi);

        scan.close();
    }
}
