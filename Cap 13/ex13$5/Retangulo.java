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

    public int getLargura() {
        return p2.getX() - p1.getX();
    }

    public int getAltura() {
        return p2.getY() - p1.getY();
    }

    public Ponto obterCentro(){
        int centx = p1.getX() + p2.getX();
        int centy = p2.getY() + p1.getY();

        return new Ponto(centx/2, centy/2);
    }

    public void mover(int quantidadeX, int quantidadeY) {
        p1.setX(p1.getX() + quantidadeX);
        p1.setY(p1.getY() + quantidadeY);
        p2.setX(p2.getX() + quantidadeX);
        p2.setY(p2.getY() + quantidadeY);
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
