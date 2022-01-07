package curso_loiane.aulas.aula17;

public class LoopFor {
    public static void main(String[] args) {
        /*
        System.out.println("Normal com incremento");
        for(int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println("Normal com decremento");
        for(int i = 5; i > 0; i--) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println("Com mais de uma variável");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }
        System.out.println("Partes Ausentes");
        int i= 0;
        for (; i < 5; ) {
            System.out.println("i tem valor de " + i);
            i += 2;
        }

         */

        System.out.println("Loop sem corpo");
        int soma = 0;
        for (int i = 1; i < 5; soma += i++) ;
        System.out.println("O valor da soma é: " + soma);
    }
}
