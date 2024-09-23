public class Ponto{
    private double x;
    private double y;
    private double distancia;

    public Ponto( double x , double y ){
        this.x = x;
        this.y = y;
    }

    public double getDistancia(Ponto outroPonto) {
        double dx = this.x - outroPonto.x;
        double dy = this.y - outroPonto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "" + String.format(" [x=%.2f;y=%.2f]" , x , y);
    }
}