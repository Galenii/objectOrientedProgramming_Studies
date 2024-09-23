public class Recibo{

    private String id;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Recibo(
        String id,
        String descricao,
        int quantidade,
        double precoUnitario
    ){

        this.id = id;
        this.descricao = descricao;

        if( quantidade <= 0){
            this.quantidade = 1;
        }   else {
            this.quantidade = quantidade;
        }

        if ( precoUnitario <= 0){
            this.precoUnitario = 0;
        }   else {
            this.precoUnitario = precoUnitario;
        }

    }
    public double getValorTotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        
        String dados = "";

        dados = "Recibo:";
        dados += "\n    id = " + id;
        dados += "\n    descricao = " + descricao;
        dados += "\n    quantidade = " + quantidade;
        dados += "\n    preco = R$" + String.format( "%.2f", precoUnitario );
        dados += "\n    valor total = R$" + String.format( "%.2f", getValorTotal() );

        return dados;
        
    }

}