public class Ponto {

    private int x;
    private int y;

    public Ponto() {
        setX( 0 );
        setY( 0 );
    }

    public Ponto( int x, int y ) {
        setX( x );
        setY( y );
    }

    public int getX() {
        return x;
    }

    public void setX( int x ) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY( int y ) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format( "(%d; %d)", x, y );
    }

    public Retangulo obterCentro() {
        return null;
    }
}