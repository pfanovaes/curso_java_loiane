package curso_loiane.aulas.aula17.exercicios;

import java.util.Scanner;

public class Ex13 {
    /*
    13.Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para base");
        int base = scan.nextInt();
        System.out.println("Digite um número para o expoente");
        int expoente = scan.nextInt();

        //2^2 = 2 * 2
        //2^3 = 2 * 2 * 2

        int resultado = base;

        for (int i=1; i<expoente; i++){
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
