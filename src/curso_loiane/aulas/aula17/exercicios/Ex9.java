package curso_loiane.aulas.aula17.exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
        9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
         */
        int i;
        int impar;

        for ( i=0; i<=50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
