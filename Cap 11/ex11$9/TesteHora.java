import java.util.Scanner;

public class TesteHora {
    public static void main(String[] args) {
        
        int hora;
        int minutos;
        int segundos;

        Scanner scan = new Scanner(System.in);

        System.out.print("Horas: ");
        hora = Integer.parseInt(scan.nextLine());

        System.out.print("Minutos: ");
        minutos = Integer.parseInt(scan.nextLine());

        System.out.print("Segundos: ");
        segundos = Integer.parseInt(scan.nextLine());

        Hora h = new Hora (hora, minutos , segundos);

        System.out.println( h );
    }
}
