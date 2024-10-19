public class Retangulo {
    private Ponto p1;
    private Ponto p2;

    public Retangulo(){
        setP1( new Ponto() );
        setP2( new Ponto() );
    }

    public Retangulo( Ponto p1, Ponto p2){
        setP1( p1 );
        setP2( p2 );
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public double calcularArea(){
        int base = p2.getX() - p1.getX();
        int altura = p2.getY() - p1.getX();

        return base*altura;
    }

    @Override
    public String toString() {
        return p1+"\n"+
                "|==============|\n" + //
                "|              |\n" + //
                "|              |\n" + //
                "|==============|\n"+
                p2;
    }
}
