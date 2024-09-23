import java.util.Scanner;
public class TesteRecibo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        String id;
        String descricao;
        int quantidade;
        double preco;

        System.out.print("Id: \n");
        id = scan.nextLine();
        System.out.print("Descricao: \n");
        descricao = scan.nextLine();
        System.out.print("Quantidade: \n");
        quantidade = Integer.parseInt(scan.nextLine());
        System.out.print("Preco unitario: \n");
        preco = Double.parseDouble(scan.nextLine());

        Recibo r = new Recibo(id, descricao, quantidade, preco);

        System.out.println( r );
    }
}
