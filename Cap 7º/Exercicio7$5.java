import java.util.Scanner;

public class Exercicio7$5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];
        int cont = 0;

        Scanner scan = new Scanner (System.in);
        
        for(int i = 0 ; i < 5 ; i++){
            System.out.printf("n1[%d]: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        
            System.out.printf("n2[%d]: ",i);
            array2[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] %2 == 0){
                System.out.printf("%d eh par e",array[i]);
                    if(array[i] % array2[i] == 0){
                        System.out.printf(" %d eh divisivel por %d\n", array[i] , array2[i]);
                    } else {
                        System.out.printf(" %d nao eh divisivel por %d\n", array[i] , array2[i]);
                    }
            }
            if(array[i] %2 == 1){
                System.out.printf("%d eh impar e",array[i]);
                    if(array[i] % array2[i] == 0){
                        System.out.printf(" %d eh divisivel por %d\n", array[i] , array2[i]) ;
                    } else {
                        System.out.printf(" %d nao eh divisivel por %d\n", array[i] , array2[i]);
                    }
            }
        }
        scan.close();
    }
    
    public static boolean ehPar(int n){
        if ( n %2 == 0){
            return true;
        } 
            return false;
        }
    
    public static boolean ehDivisivel(int dividento , int divisor){
        if(dividento % divisor == 0){
            return true;
        }
            return false;
    }
    }

