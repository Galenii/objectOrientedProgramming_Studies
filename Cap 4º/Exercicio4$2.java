import java.util.Scanner;

public class Exercicio4$2{
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];
        int n;

        Scanner scan = new Scanner (System.in);

        for( int i = 0 ; i < array.length ; i++ ){
            System.out.printf("array[%d]: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }
            System.out.println("Multiplicar por: ");
            n = Integer.parseInt(scan.nextLine());

        for( int i = 0 ; i < array.length ; i++ ){
            array2[i] = array[i] ; 
        }
        for ( int i = 0 ; i < array.length ; i++ ){
            array2[i] = array[i] * n;
            System.out.printf("arrayMult[%d] = %d\n",i , array2[i]);
        }
        scan.close();
    }
}