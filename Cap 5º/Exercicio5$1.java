import java.util.Scanner;

public class Exercicio5$1{
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        

        Scanner scan = new Scanner (System.in);

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                System.out.printf("array[%d][%d]: ",i,j);
                array[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){       
                System.out.printf("%03d",array[i][j],array[i][j]);
                if (j >= 0 && j < 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}