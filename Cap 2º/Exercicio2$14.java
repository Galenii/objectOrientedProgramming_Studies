import java.util.Scanner;

public class Exercicio2$14 {
    public static void main(String[] args) {
        double peso;
        double h;
        double imc;

        Scanner scan = new Scanner (System.in);

        System.out.print("Entre com seu peso em quilogramas: ");
        peso = Double.parseDouble(scan.nextLine());

        System.out.print("Entre com sua altura em metros: ");
        h = Double.parseDouble(scan.nextLine());

        
        imc = peso / (h * h);
        

        if(imc >= 18.5 && imc < 25){
            System.out.printf("IMC: %.2f\n",imc);
            System.out.printf("Voce esta abaixo do peso ideal!\n");
        }
        if(imc >= 25 && imc < 30){
            System.out.printf("IMC: %.2f\n",imc);
            System.out.printf("Atencao, voce esta acima de seu peso (sobrepeso)!\n");
        }
        if(imc >= 30 && imc < 35){
            System.out.printf("IMC: %.2f\n",imc);
            System.out.printf("Cuidado! Obesidade grau I!\n");
        }
        if(imc >= 35 && imc < 40){
            System.out.printf("IMC: %.2f\n",imc);
            System.out.printf("Cuidado! Obesidade grau II!\n");
        }
        if(imc > 40){
            System.out.printf("IMC: %.2f\n",imc);
            System.out.printf("Muito cuidado!!! Obesidade grau III!\n");
        } 
        if ( imc <= 18.5){
            System.out.printf("IMC: %.2f\n",imc);
            System.out.printf("Voce esta abaixo do peso ideal!\n");
        }

        
        scan.close();
    }   
}
