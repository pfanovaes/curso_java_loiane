package curso_loiane.aulas.exercicios17;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        7. Faça um programa que leia 5 números e informe o maior número.
         */


        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        for (int i=0; i<5; i++){

            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                //System.out.println("o número maior mudou: " + maior);
            }

            if (num < menor) {
                menor = num;
            }

        }
        int media = (maior + menor) / 2;
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("A média do maior e menor numero foi: " + media);
    }
}
