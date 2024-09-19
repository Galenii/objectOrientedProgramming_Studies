import java.util.Scanner;

public class Exercicio7$3 {

    public static void main(String[] args) {

        double num;
        
        Scanner scan = new Scanner(System.in);

        double[] array = new double[5];
        double[] array2 = new double[5];

        for(int i = 0 ; i < 5 ; i++){
            
            do {
                System.out.print("");
                System.out.printf("n1[%d]: ",i);
                array[i] = Double.parseDouble(scan.nextLine());
                if (array[i] <= 0) {
                    System.out.println("Valor deve ser positivo. Tente novamente.");
                }
            } while (array[i] <= 0);

            do {
                System.out.print("");
                System.out.printf("n2[%d]: ",i);
                array2[i] = Double.parseDouble(scan.nextLine());
                if (array2[i] <= 0) {
                    System.out.println("Valor deve ser positivo. Tente novamente.");
                }
            } while (array2[i] <= 0);
        
        }

        
        for(int i = 0 ; i < array.length ; i++){
            if( array[i] != array2[i]){
                System.out.printf("%.2f, %.2f: O maior valor e %.2f\n", array[i] , array2[i] , maiorNumero( array[i] , array2[i]  ));
            } 
            else if ( array[i] == array2 [i]){
                System.out.printf("%.2f, %.2f: Eles sao iguais\n", array[i] , array2[i]);
            }
        }
    }
    
    

    public static double maiorNumero(double n1, double n2){
        if( n1 > n2 ){
            return n1;
        } else {
            return n2;
        }
    }
}



