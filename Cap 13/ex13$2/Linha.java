public class Linha {

    private Ponto p1;
    private Ponto p2;

    public Linha() {
        setP1( new Ponto() );
        setP2( new Ponto() );
    }

    public Linha( Ponto p1, Ponto p2 ) {
        setP1( p1 );
        setP2( p2 );
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1( Ponto p1 ) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2( Ponto p2 ) {
        this.p2 = p2;
    }

    public double calcularComprimento() {

        int cateto1 = p2.getX() - p1.getX();
        int cateto2 = p2.getY() - p1.getY();

        return Math.sqrt( (cateto1 * cateto1) + (cateto2 * cateto2) );

    }

    @Override
    public String toString() {
        return p1 + " ------ " + p2;
    }

}