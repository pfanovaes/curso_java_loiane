package curso_loiane.aulas.aula17.exercicios;

import java.util.Scanner;

public class Ex14 {
    /*
    14.Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        for (int i=0; i<10; i++){

            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }

        }


