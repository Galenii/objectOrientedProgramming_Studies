import java.util.Scanner;

public class Exercicio7$1{
    public static void main(String[] args) {

        int[] array = new int[5];
        int n;

        Scanner scan = new Scanner (System.in);
        
        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("n%d: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }
        
        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("absoluto(%d) = %d\n", array[i] , absoluto(array[i]));
        }
        scan.close();
    }
    public static int absoluto (int n){    
        if( n < 0){
            n = n*-1;
        }
        return n;
    } 
    }
   
