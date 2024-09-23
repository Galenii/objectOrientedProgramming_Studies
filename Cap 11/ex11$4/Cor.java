public class Cor{
    private int vermelho;
    private int verde;
    private int azul;

    public Cor(int vermelho, int verde, int azul){
        if( vermelho < 0 ){
            this.vermelho = 0;
        } else if ( vermelho > 255 ){
            this.vermelho = 255;
        } else {
            this.vermelho = vermelho;
        }

        if( verde < 0 ){
            this.verde = 0;
        } else if ( verde > 255 ){
            this.verde = 255;
        } else {
            this.verde = verde;
        }

        if( azul < 0 ){
            this.azul = 0;
        } else if ( azul > 255 ){
            this.azul = 255;
        } else {
            this.azul = azul;
        }
    }
    
    @Override
    public String toString() {
        return "rgb" + String.format( "( %d, %d, %d ) ", vermelho , verde , azul);
    }
    
}