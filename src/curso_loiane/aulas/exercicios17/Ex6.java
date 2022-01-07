package curso_loiane.aulas.exercicios17;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        6. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
         */


        int num= 0;

        do {
            System.out.println(num);
            num++;
        } while (num >=1 && num <= 20);

        for (int i=1; i<= 20; i++){
            System.out.print(i + " ");
        }

    }
}
