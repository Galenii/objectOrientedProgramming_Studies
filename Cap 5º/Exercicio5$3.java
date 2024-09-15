import java.util.Scanner;

public class Exercicio5$3 {
    public static void main(String[] args) {

        int[][] array = new int[3][4];
        int n1;

        Scanner scan = new Scanner (System.in);

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                System.out.printf("array[%d][%d]: ",i,j);
                array[i][j] = Integer.parseInt(scan.nextLine());
            }
        }

        System.out.println("Multiplicar por: ");
        n1 = Integer.parseInt(scan.nextLine());

        System.out.println("arrayMult:");
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                System.out.printf("%03d",array[i][j]*n1);
                if (j >= 0 && j < 3){
                    System.out.print(" ");
                } 
            }
            System.out.println("");
        }
        scan.close();
    }
}
