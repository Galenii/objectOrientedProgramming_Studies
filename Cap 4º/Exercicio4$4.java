import java.util.Scanner;

public class Exercicio4$4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int n;

        Scanner scan = new Scanner (System.in);

        for( int i = 0 ; i < array.length ; i++){
            System.out.printf("array[%d]: ",i);
            array[i] = Integer.parseInt( scan.nextLine() );
        }
        System.out.print("Buscar por: ");
        n = Integer.parseInt(scan.nextLine());

        for( int i = 0 ; i < array.length ; i++ ){
            if( array[i] == n ){
                System.out.printf("Indice %d: ACHEI\n",i);
            } else {
                System.out.printf("Indice %d: NAO ACHEI\n",i);
            }
        }
        scan.close();
    }
}
