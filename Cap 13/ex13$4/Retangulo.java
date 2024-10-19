public class Retangulo{

    private Ponto p1;
    private Ponto p2;

    public Retangulo(){
        setP1(new Ponto());
        getP2(new Ponto());
    }

    public Retangulo(Ponto p1, Ponto p2){
        setP1( p1 );
        getP2( p2 );
    }

    public Ponto getP1(){
        return p1;
    }

    public void setP1( Ponto p1 ) {
        this.p1 = p1;
    }

    public Ponto getP2(){
        return p2;
    }

    public void getP2( Ponto p2 ){
        this.p2 = p2;
    }

    public Ponto obterCentro(){
        int centx = p1.getX() + p2.getX();
        int centy = p2.getY() + p1.getY();

        return new Ponto(centx/2, centy/2);
    }
    @Override
    public String toString() {
        return p1+"\n"+
               "|==============|\n"+
               "|              |\n"+
               "|              |\n"+
               "|==============|\n"+
               p2;
    }
}