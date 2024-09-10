import java.util.Scanner;

public class Exercicio4$12 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[4];
        int cont = 0;

        Scanner scan = new Scanner (System.in);

        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("array[%d]: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i = 1 ; i < array.length ; i++){
            array2[cont] = array[i];
            cont++;
        }

        for (int i = 0; i < array2.length; i++) {
            if(array[i] != 0){
            System.out.printf("array[%d] = %d\n",i,array2[i]);
            }
        }
    }
}
