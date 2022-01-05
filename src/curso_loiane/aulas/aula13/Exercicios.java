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
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota do segundo bimestre:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre:");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a nota do quarto bimestre:");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) /4;
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

        /*
        System.out.println("Digite uma temperatura em Farenheit:");
        double tempFarenheit = scan.nextDouble();
        double tempCelsius = (5 * (tempFarenheit - 32) /9 );
        System.out.println("A temperatura em Celsius é: " + tempCelsius);
        */

        //10
        // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

        /*
        System.out.println("Digite uma temperatura em Celsius:");
        double tempCelsius = scan.nextDouble();
        double tempFarenheit = ((9 * tempCelsius) + 160) / 5;
        System.out.println("A temperatura em Farenheit é: " + tempFarenheit);
        */


        //11
        // Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        // a. o produto do dobro do primeiro com metade do segundo .
        // b. a soma do triplo do primeiro com o terceiro.
        // c. o terceiro elevado ao cubo.

        /*
        System.out.println("Digite um número inteiro");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro");
        int num2 = scan.nextInt();
        System.out.println("Digite um número real");
        double num3 = scan.nextDouble();

        double itema = (2 * num1) * (num2 / 2);
        System.out.println("o produto do dobro do primeiro com metade do segundo é: " + itema);

        double itemb = (3 * num1) + num3;
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + itemb);

        double itemc = Math.pow(num3, 3);
        System.out.println("o terceiro elevado ao cubo é: " + itemc);
        */

        //12
        // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        // (72.7*altura) - 58

        /*
        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O seu peso ideal é: " + pesoIdeal);
        */

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

        /*
        System.out.println("Quanto você ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou nesse mês?");
        double numHoras = scan.nextDouble();
        double salarioBruto = valorHora * numHoras;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double descontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Seu salário bruto foi R$:" + salarioBruto);
        System.out.println("Vc pagou R$:" + inss + " para o inss");
        System.out.println("Vc pagou R$:" + sindicato + " para o sindicato");
        System.out.println("Vc pagou R$:" + ir + " para o imposto de renda");
        System.out.println("O total de descontos no seu salário foi de R$:" + descontos);
        System.out.println("Seu salário líquido foi R$:" + salarioLiquido);
        */

        //14
        // 14.Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
        // calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

        System.out.println("Qual o tamanho do aquivo em MB?");
        double tamanhoArquivo = scan.nextDouble();
        System.out.println("Qual a velocidade da internet em Mbs?");
        double velocidadeInternet = scan.nextDouble();

        double tempoDownload = (tamanhoArquivo / velocidadeInternet) / 60;
        System.out.println("o tempo aproximado de download será: "+ tempoDownload + " minutos");

    }
}
