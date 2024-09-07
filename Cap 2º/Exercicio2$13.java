import java.util.Scanner;

public class Exercicio2$13 {
    public static void main(String[] args) {
        Double n1;
        Double n2;
        Double avop;
        Double temp;
        Double media;

        Scanner scan = new Scanner (System.in);

        System.out.print("Nota Av. 1: ");
        n1 = Double.parseDouble(scan.nextLine());

        System.out.print("Nota Av. 1: ");
        n2 = Double.parseDouble(scan.nextLine());

        System.out.print("Nota Optativa: ");
        avop = Double.parseDouble(scan.nextLine());

        if(n1 < n2){
            temp=n1;
            n1=n2;
            n2=temp;
        } 
        if(n2 < avop){
            temp=n2;
            n2=avop;
            avop=temp;
        }
        if(n1 < n2){
            temp=n1;
            n1=n2;
            n2=temp;
    }

    media = (n1+n2)/2;

    if(media > 6){
        System.out.printf("Media: %.2f\n",media);
        System.out.printf("Aprovado!");
    }
    if(media < 6 && media > 4){
        System.out.printf("Media: %.2f\n",media);
        System.out.printf("Exame.");
    }
    if(media < 4){
        System.out.printf("Media: %.2f\n",media);
        System.out.printf("Reprovado...");
    }

    
    scan.close();
}
}