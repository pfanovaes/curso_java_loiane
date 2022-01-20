package curso_loiane.aulas.aula27.exercicios;

public class Ex1 {
    /*
    1. Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada.
     */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
        //lampada.ligar();
    }
}
