import java.time.format.DecimalStyle;

public class Fracao{
    private double numerador;
    private double denominador;

    public Fracao(double numerador , double denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao somar( Fracao outra ){
        double de = this.denominador * outra.denominador;

        double nu = (( de/this.denominador) * numerador ) + ( denominador/outra.denominador ) * outra.numerador;
    
        return new Fracao(nu , de);
    }

    public Fracao subtrair( Fracao outra ){
        double de = this.denominador * outra.denominador;

        double nu = (( de/this.denominador) * numerador ) - ( denominador/outra.denominador ) * outra.numerador;
    
        return new Fracao(nu , de);
    }

    public Fracao multiplicar( Fracao outra ){
        double de = this.denominador * outra.denominador;

        double nu = this.numerador * outra.numerador;

        return new Fracao(nu, de);
    }

    public Fracao dividir( Fracao outra ){
        double de = this.denominador * outra.numerador;

        double nu = this.numerador * outra.denominador;

        return new Fracao(nu, de);
    }


    @Override
    public String toString() {
        return String.format("%.2f/%.2f", numerador,denominador);
    }

}