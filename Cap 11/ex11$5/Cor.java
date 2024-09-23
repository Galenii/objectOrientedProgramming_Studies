public class Cor{
    private int vermelho;
    private int verde;
    private int azul;

    public Cor(int vermelho , int verde , int azul){
        this.vermelho = vermelho;
        this.verde = verde;
        this.azul = azul;
    }

    public void escurecer(){

        this.vermelho = (int) (this.vermelho * 0.7);
        this.verde = (int) (this.verde * 0.7);
        this.azul = (int) (this.azul * 0.7);
    }

    @Override
    public String toString() {
        return "rgb" + String.format("( %d, %d, %d )", vermelho , verde , azul);
    }
}