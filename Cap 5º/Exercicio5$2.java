import java.util.Scanner;

public class Exercicio5$2 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int[][] array2 = new int[3][3];
        int[][] soma = new int[3][3];
        int i = 0;
        int j = 0;

        Scanner scan = new Scanner(System.in);
        
        for(i = 0 ; i < array.length ; i++){
            for(j = 0 ; j < array[i].length ; j++){
                System.out.printf("array[%d][%d]: " ,i,j);
                array[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        for(i = 0 ; i < array2.length ; i++){
            for(j = 0 ; j < array2[i].length ; j++){
                System.out.printf("array[%d][%d]: " ,i,j);
                array2[i][j] = Integer.parseInt(scan.nextLine());
    
            }    
        }
        for(i = 0 ; i < soma.length ; i++){
            for(j = 0 ; j < soma[i].length ; j++){
                soma[i][j] = array[i][j] + array2[i][j];
            }    
        }
        
        System.out.printf("array1:       array2:       arraySoma:\n");
        for (i = 0; i < array.length; i++){
            for (j = 0; j < array[i].length; j++){
                System.out.printf("%03d ", array[i][j]);
                if (j == 2 && i == 1){
                    System.out.printf("+ ");
                } else if (j == 2 && i != 1){
                    System.out.printf("  ");
                }
            }
        
        for (j = 0; j < array[i].length; j++){
            System.out.printf("%03d ", array2[i][j]);
            if (j == 2 && i != 1){
                System.out.printf("  ");
            }else if (j == 2 && i == 1){
                System.out.printf("= ");
            }
        }
        for (j = 0; j < array[i].length; j++){
            System.out.printf("%03d", soma[i][j]);
            if (j >= 0 && j < 2){
                System.out.printf(" ");
            }
        }
        System.out.printf("\n");
    
        scan.close();
        }
    }
}
