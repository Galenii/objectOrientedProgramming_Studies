import java.util.Scanner;

public class Exercicio4$8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] par = new int[5];
        int[] impar = new int[5];
        int cont1 = 0;
        int cont2 = 0;

        Scanner scan = new Scanner (System.in);

        for(int i = 0 ; i < array.length ; i++){
            System.out.printf("array[%d]: ",i);
            array[i] = Integer.parseInt(scan.nextLine());
        }

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] % 2 == 0){
                par[cont1] = array[i];
                cont1++;
            } else {
                impar[cont2] = array[i];
                cont2++;
            }
        }
            System.out.print("Numeros pares: ");
                for(int i = 0 ; i < cont1 ; i++){
                    if(i == (cont1 - 1)){
                        System.out.printf("%d.",par[i]);
                    } else {
                        System.out.printf("%d ",par[i]);
                    }

                }
            if(cont1 == 0){
                System.out.print("nao ha.");
            }
            System.out.print("\nNumeros impares: ");  
                for(int i = 0 ; i < cont2 ; i++){
                    if(i == (cont2 - 1)){
                        System.out.printf("%d.",impar[i]);
                    } else {
                        System.out.printf("%d ",impar[i]);                        
                    }
                }
            if(cont2 == 0){
                System.out.print("nao ha.");
            }
        
        scan.close();
    }
    
}
