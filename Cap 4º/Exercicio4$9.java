import java.util.Scanner;

public class Exercicio4$9 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];
        int cont = 0;

        Scanner scan = new Scanner (System.in);

        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("array[%d]: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }

        for( int i = (array.length - 1); i >= 0 ; i--){
            array2[i] = array[cont];
            cont++;
        }

        for( int i = 0 ; i < array2.length ; i++){
            System.out.printf("arrayInv[%d] = %d\n",i,array2[i]);
        }
    }
}
