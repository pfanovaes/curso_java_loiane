package curso_loiane.aulas.aula13;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        //1
        // Faça um Programa que mostre a mensagem "Alo mundo" na tela.

        /*
        System.out.println("Alo Mundo");
        */


        //2
        // Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        /*
        System.out.println("Digite um numero:");
        int num = scan.nextInt();
        System.out.println("O número digitado foi: " + num);
        */

        //3
        // Faça um Programa que peça dois números e imprima a soma

        /*
        System.out.println("Digite um número:");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número");
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos números digitados é: " + soma);
        */


        //4
        // Faça um Programa que peça as 4 notas bimestrais e mostre a média.

        /*
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

         */

        //5
        // Faça um Programa que converta metros para centímetros.

        /*
        System.out.println("Digite um valor em metros: ");
        double valorMetros = scan.nextDouble();
        double valorCentimetros = valorMetros * 100;
        System.out.println("O valor digitado em metros: " + valorMetros + " é equivalente a " + valorCentimetros + " cm");
        */


        //6
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        /*
        System.out.println("Digite o valor do raio de um círculo:");
        double raio = scan.nextDouble();
        double area = Math.PI * (raio * raio);
        System.out.println("A área do círculo é: " + area);
        */

        //7
        // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        /*
        System.out.println("Digite a altura de um quadrado: ");
        double altura = scan.nextDouble();
        double area = (altura * altura);
        System.out.println("A área do quadrado é: " + area);
        */

        //8
        // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês.

        /*
        System.out.println("Quanto você ganha por hora?");
        double cotacao  = scan.nextDouble();
        System.out.println("E quantas horas você trabalha por mês?");
        double horas = scan.nextDouble();
        double salario = cotacao * horas;
        System.out.println("Esse mês você ganhou R$: " + salario);
        */

        //9
        //  Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
        //  o C = (5 * (F-32) / 9).

        //10
        // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

        //11
        // Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        // a. o produto do dobro do primeiro com metade do segundo .
        // b. a soma do triplo do primeiro com o terceiro.
        // c. o terceiro elevado ao cubo.

        //12
        // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        // (72.7*altura) - 58

        //13
        /* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
         Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
         8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
          . salário bruto.
          a. quanto pagou ao INSS.
          b. quanto pagou ao sindicato.
          c. o salário líquido.
          d. calcule os descontos
          e o salário líquido, conforme a tabela abaixo:
          + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
         Obs.: Salário Bruto - Descontos = Salário Líquido.

         */

        //14
        // 14.Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
        // calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

    }
}
