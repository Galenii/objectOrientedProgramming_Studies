import java.util.Scanner;

public class Exercicio4$5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int n;
        int cont = 0;

        Scanner scan = new Scanner (System.in);

        for( int i = 0 ; i < array.length ; i++){
            System.out.printf("array[%d]: ",i);
            array[i] = Integer.parseInt( scan.nextLine() );
        }
        System.out.print("Buscar por: ");
        n = Integer.parseInt(scan.nextLine());

        for( int i = 0 ; i < array.length ; i++ ){
            if( array[i] == n ){
                cont++;
            }
        }
            
            if( cont == 1){
                    System.out.printf("O array contem %d ocorrencia do valor %d.\n",cont,n);
            }
            else if ( cont > 1 ){
                    System.out.printf("O array contem %d ocorrencias do valor %d.\n",cont,n);
            } else {
                    System.out.printf("O array nao contem o valor %d.",n);
            }
            
            
        scan.close();
    }
}


