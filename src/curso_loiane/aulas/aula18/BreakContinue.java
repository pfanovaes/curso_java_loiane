package curso_loiane.aulas.aula18;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        //primeiro número divisível por 7.

        for (int i=num; i<=max ; i++) {
            if ( i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break; // pq eu só quero o primeiro número.
            }
        }
        */

        System.out.println("Entre com um número");
        int num = scan.nextInt();
        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        //primeiro número divisível por 7.

        for (int i=num; i<=max ; i++) {
            if ( i % 7 == 0) {
                continue; // pula os múltiplos de sete
            }
            System.out.println("O valor de i é: " + i);
        }


    }
}
