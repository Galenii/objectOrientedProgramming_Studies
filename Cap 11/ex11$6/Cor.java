public class Cor {
    private int vermelho;
    private int verde;
    private int azul;

    public Cor(int vermelho , int verde , int azul){
        this.vermelho = vermelho;
        this.verde = verde;
        this.azul = azul;
    }

    public void clarear(){

        if( vermelho > 3 ){
            this.vermelho = (int) (this.vermelho / 0.7);
            if(vermelho >= 255){
                this.vermelho = 255;
                }
        } else if ( vermelho >= 1 && vermelho <= 3 ){
            if( vermelho == 0 ){
            this.vermelho = 3;
                }
            this.vermelho = 3;
            this.vermelho = (int) (this.vermelho / 0.7);
        } else if( vermelho == 0 ){
            this.vermelho = 3;
        }

        if( verde > 3 ){
            this.verde = (int) (this.verde / 0.7);
            if(verde >= 255){
                this.verde = 255;
                }
        } else if ( verde >= 1 && verde <= 3 ){
            if( verde == 0 ){
            this.verde = 3;
                }
            this.verde = 3;
            this.verde = (int) (this.verde / 0.7);
        } else if( verde == 0 ){
            this.verde = 3;
        }

        if( azul > 3 ){
            this.azul = (int) (this.azul / 0.7);
            if(azul >= 255){
                this.azul = 255;
                }
        } else if ( azul >= 1 && azul <= 3 ){
            if( azul == 0 ){
            this.azul = 3;
                }    
            this.azul = 3;
            this.azul = (int) (this.azul / 0.7);
        } else if( azul == 0 ){
            this.azul = 3;
        }
        
    }

    @Override
    public String toString() {
        return "rgb" + String.format("( %d, %d, %d )", vermelho , verde , azul);
    }
}
