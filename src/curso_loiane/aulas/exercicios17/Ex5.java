package curso_loiane.aulas.exercicios17;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
         */


        System.out.println("Digite a população de um país");
        int populacaoA = scan.nextInt();
        System.out.println("Digite a taxa de crescimento anual desse país");
        double crescA = scan.nextDouble();
        System.out.println("Digite a populacao de outro país");
        int populacaoB = scan.nextInt();
        System.out.println("Digite a taxa de crescimento anual desse país");
        double crescB = scan.nextDouble();
        int count = 0;

        while (populacaoA < populacaoB){

            populacaoA += (populacaoA/100) * crescA;
            populacaoB += (populacaoB/100) * crescB;
            count++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Qtd anos:     " + count);

    }
}
