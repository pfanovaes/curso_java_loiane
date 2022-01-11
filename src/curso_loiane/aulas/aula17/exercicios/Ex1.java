package curso_loiane.aulas.aula17.exercicios;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
         */

        System.out.println("Digite uma nota de 1 a 10");
        int nota = scan.nextInt();

        while (nota < 1 || nota > 10) {
            System.out.println("Nota inválida");
            System.out.println("Digite uma nota de 1 a 10");
            nota = scan.nextInt();
        }

    }
}
