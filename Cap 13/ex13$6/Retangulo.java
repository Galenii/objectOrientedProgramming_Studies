public class Retangulo{

        
    private Ponto p1;
    private Ponto p2;
    private Ponto ponto;

    public Retangulo(){
        setP1(new Ponto());
        getP2(new Ponto());
        getPONTO(new Ponto());
    }

    public Retangulo(Ponto p1, Ponto p2, Ponto ponto){
        setP1( p1 );
        getP2( p2 );
        getPONTO( ponto );
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

    public Ponto getPonto(){
        return ponto;
    }

    public void getPONTO( Ponto ponto ){
        this.ponto = ponto;
    }

    public Ponto obterCentro(){
        int centx = p1.getX() + p2.getX();
        int centy = p2.getY() + p1.getY();

        return new Ponto(centx/2, centy/2);
    }

    public boolean contem( Ponto ponto ){
        if(ponto.getX() >= this.p1.getX() && ponto.getX() <= this.p2.getX() && ponto.getY() >= this.p1.getY() && ponto.getY() <= this.p2.getY()){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return p1+"\n"+
               "|==============|\n"+
               "|              |\n"+
               "|              |\n"+
               "|==============|\n"+
               p2+"\n"+
               "Ponto criado: "+ ponto;
    }
}