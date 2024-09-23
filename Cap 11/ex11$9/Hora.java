public class Hora{

    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

        if (hora < 0) {
            this.hora = 0;
        }

        if (minutos < 0) {
            this.minutos = 0;
        } else if (minutos > 59) {
            this.minutos = 59;
        }

        if (segundos < 0) {
            this.segundos = 0;
        } else if (segundos > 59) {
            this.segundos = 59;
        
        }
    }

    public int TesteHora(){
        if(hora <= 24){
            this.hora = hora;
        } else {
            int resto = (hora - 24) * 60;
            this.hora = hora - 24;
        }

        if(minutos <= 59){
            int resto += minutos;
        }
    }

    @Override
    public String toString() {
        return String.format("Hora: %02d:%02d:%02d", hora, minutos, segundos);
    }
}