public class Vaga{
    String placaVeiculos;
    int tempo;
    double 

    public Vaga( String placaVeiculos ,  int tempo){
        this.placaVeiculos = placaVeiculos;
        if( tempo <= 0){
            this.tempo = 1;
        }
    }

    public double getTaxa(){
        
        double valor = 2;

        if(tempo > 3){
            double taxa = 0.5 * (tempo - 3);

            valor += taxa;

            if( valor > 10){
                valor = 10;
            }

        }
    }
    @Override
    public String toString() {
        return "palca";
    }


}