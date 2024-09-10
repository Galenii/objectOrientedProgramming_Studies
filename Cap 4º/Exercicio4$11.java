import java.util.Scanner;

public class Exercicio4$11 {
    public static void main(String[] args) {
        int[] array = new int[10];  
        int ne;
        int n1;

        Scanner scan = new Scanner (System.in);
        
        System.out.println("Quantidade de elementos (1 a 9): ");
        ne = Integer.parseInt(scan.nextLine());

        while(ne < 1 || ne > 9){
            System.out.print("Quantidade incorreta, forneca novamente!");
            System.out.print("Quantidade de elementos (1 a 9): ");
            ne = Integer.parseInt(scan.nextLine());
        }

        for(int i = 0 ; i < ne ; i++){
            System.out.printf("array[%d]: \n",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Valor que sera inserido: ");
        n1 = Integer.parseInt(scan.nextLine());

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = n1;
    

        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
            System.out.printf("array[%d] = %d\n",i,array[i]);
            }
        }
        scan.close();
    }
}


