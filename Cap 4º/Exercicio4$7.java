import java.util.Scanner;

public class Exercicio4$7 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];
        int soma;

        Scanner scan = new Scanner ( System.in );
        
        System.out.println("Forneca os valores do primeiro array: ");
        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("     array1[%d]: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }
        
        System.out.println("Forneca os valores do segundo array: ");
        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("     array2[%d]: ",i);
            array2[i] = Integer.parseInt(scan.nextLine());
        }

        soma = 0;

        for(int i = 0 ; i < array.length ; i++){
            soma = array[i] + array2[i];
            System.out.printf("arraySoma[%d] = %d\n",i,soma);
        }
        scan.close();
    }
}
