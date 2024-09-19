public class Exercicio7$7 {
    public static void main(String[] args) {

        int[] ehPrimo = new int[20];

        for(int i = 1 ; i <= 20 ; i++){
            if(ehPrimo(i)){
                System.out.printf("%d: eh primo\n",i);
            } else {
                System.out.printf("%d: nao eh primo\n",i);
            }
        }
    }
    public static boolean ehPrimo(int n){
        int cont = 0;
        for(int i = 1 ; i <= 20 ; i++ ){
            if(n % i == 0){
                cont++;
            }
        }
        if( cont == 2){
            return true;
        } 
            return false;
    }
}
