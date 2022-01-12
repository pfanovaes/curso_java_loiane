package curso_loiane.aulas.aula24.exercicios;

public class Ex1 {

        /*
        1. Escreva  uma  classe  para  representar  uma  lâmpada  que  está  à  venda  em   um  supermercado.
         */

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
    }
}
