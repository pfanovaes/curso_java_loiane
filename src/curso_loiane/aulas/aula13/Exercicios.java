package curso_loiane.aulas.aula13;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*

        //https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        //1
        System.out.println("Alo Mundo");

        //2

        System.out.println("Digite um numero:");
        int num = scan.nextInt();
        System.out.println("O número digitado foi: " + num);

        //3

        System.out.println("Digite um número:");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número");
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos números digitados é: " + soma);

         */

        //4

        System.out.println("Digite a nota do primeiro bimestre:");
        int nota1 = scan.nextInt();
        System.out.println("Digite a nota do segundo bimestre:");
        int nota2 = scan.nextInt();
        System.out.println("Digite a nota do terceiro bimestre:");
        int nota3 = scan.nextInt();
        System.out.println("Digite a nota do quarto bimestre:");
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println("A média das notas digitadas foi: " + media);

        //5


    }
}
