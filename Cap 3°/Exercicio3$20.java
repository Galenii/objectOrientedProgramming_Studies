public class Exercicio3$20 {
    public static void main(String[] args) {
        
        for(int i = 0;i < 5; i++){
            for(int j = 0; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for(int i = 1; i <= 5; i++){
            for(int j = 5 ; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        int z = 0;

        for(int i = 1; i <= 5; i++){
            for(int j = 5 - i; j >= 1; j--){ 
                System.out.print(" ");;
            }
            for(int j = 1; j <= i; j++){
            System.out.print("*");
            }
        System.out.println("");
        }
        System.out.println(" ");

        int xs = 0;

        for( int i = 1 ; i <= 5; i++){
            for(int j = 0 ;j < xs ; j++){
                System.out.print(" ");;
            }
            xs++;
            for(int j = 5 ; j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
   } 
        
}


    

    

