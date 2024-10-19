public class Retangulo {

    private Ponto p1;
    private Ponto p2;

    public Retangulo(int x1, int y1, int x2, int y2) {
        this.p1 = new Ponto(x1, y1);
        this.p2 = new Ponto(x2, y2);
    }

    public int getX1() {
        return p1.getX();
    }

    public int getY1() {
        return p1.getY();
    }

    public int getX2() {
        return p2.getX();
    }

    public int getY2() {
        return p2.getY();
    }

    public boolean intersepta(Retangulo outroRetangulo) {
        if (outroRetangulo.p1.getX() >= this.p1.getX() && outroRetangulo.p1.getX() <= this.p2.getX()
                && outroRetangulo.p1.getY() >= this.p1.getY() && outroRetangulo.p1.getY() <= this.p2.getY()) {
            return true;
        }

        if (outroRetangulo.p2.getX() >= this.p1.getX() && outroRetangulo.p2.getX() <= this.p2.getX()
                && outroRetangulo.p2.getY() >= this.p1.getY() && outroRetangulo.p2.getY() <= this.p2.getY()) {
            return true;
        }

        if (outroRetangulo.p1.getX() >= this.p1.getX() && outroRetangulo.p1.getX() <= this.p2.getX()
                && outroRetangulo.p2.getY() >= this.p1.getY() && outroRetangulo.p2.getY() <= this.p2.getY()) {
            return true;
        }

        return false;
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