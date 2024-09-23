public class Empregado{
    String nome;
    String sobrenome;
    double salario;

    public Empregado( String nome , String sobrenome , double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario > 0){
            this.salario = salario;
        }
    }

    public void concederAumento(){
        this.salario *= 1.1;
    }

    @Override
    public String toString() {
        return "Empregado:"+
            "\n    nome = " + nome +
            "\n    sobrenome = " + sobrenome +
            "\n    salario = R$" + String.format("%.2f",salario);
    }
}