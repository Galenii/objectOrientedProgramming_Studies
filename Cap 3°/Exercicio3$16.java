public class Exercicio3$16{
    public static void main(String[] args) {
        int i;
        int a = 1;
        int b = 1;
        int t;
        
        for(i = 0; i < 20 ; i++){
            System.out.printf("%d ",a);
            t = b;
            b = a + b;
            a = t;
        } 
    }
}