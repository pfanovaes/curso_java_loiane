package curso_loiane.aulas.aula17.exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        8. Faça um programa que leia 5 números e informe a soma e a média dos números.
         */

        System.out.println("Digite um número");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número");
        int num2 = scan.nextInt();
        System.out.println("Digite outro número");
        int num3 = scan.nextInt();
        System.out.println("Digite outro número");
        int num4 = scan.nextInt();
        System.out.println("Digite outro número");
        int num5 = scan.nextInt();

        int soma = (num1 + num2 + num3 + num4 + num5);
        System.out.println("A soma dos números é: " + soma);
        double media = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("A média dos números é: " + media);

        /*
        int num;
        double media;
        int soma = 0;

        for (int i=0; i<5; i++){

            System.out.println("Digite um número");
            num = scan.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
         */

    }
}
