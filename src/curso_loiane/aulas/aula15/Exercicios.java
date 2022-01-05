package curso_loiane.aulas.aula15;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1. Faça um Programa que peça dois números e imprima o maior deles.

        /*
        System.out.println("Digite um número:");
        int num1 = scan.nextInt();
        System.out.println("Digite um segundo número");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O " + num1 + " é maior");
        } else {
            System.out.println("O " + num2 + " é maior");
        }
        */

        //2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

        /*
        System.out.println("Digite um valor:");
        int num = scan.nextInt();

        if ( num >= 0 ) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        */

        //3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo inválido.

        /*
        System.out.println("Digite F ou M");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("F - feminino");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
         */

        //4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

        /*
        System.out.println("Digite uma letra");
        String letra = scan.next();

        if (letra.length() != 1) {
            System.out.println("Letra inválida");
        } else {
            switch (letra) {
                case "a": case "e": case "i": case "o": case "u": case "A": case "E": case "I": case "O": case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("consoante");
            }
        }
        */

        //5. Faça um programa para a leitura de duas notas parciais de um aluno.
        // O programa deve calcular a média alcançada por aluno e apresentar: o A mensagem "Aprovado",
        // se a média alcançada for maior ou igual a sete; o A mensagem "Reprovado",
        // se a média for menor do que sete; o A mensagem "Aprovado com Distinção",
        // se a média for igual a dez.

        /*
        System.out.println("Digite sua primeira nota");
        double nota1 = scan.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if ( media >=7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else {
            System.out.println("Reprovado");
        }
        */

        //6. Faça um Programa que leia três números e mostre o maior deles

        /*
        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número");
        double num3 = scan.nextDouble();

        if ( num1 > num2 && num1 > num3) {
            System.out.println("O maior numero é o 1: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior numero é o 2: " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("O maior numero é o 3: " + num3);
        } else {
            System.out.println("Os numeros sao iguais");
        }
        */

        //7. Faça um Programa que leia três números e mostre o maior e o menor deles.

        /*
        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro é o maior número");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior número");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O Terceiro número é o maior número");
        } else {
        System.out.println("Existem números iguais");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro é o menor número");
        } else if (num2 < num1 && num2 < num3){
            System.out.println("O segundo número é o menor número");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("O Terceiro número é o maior número");
        } else {
            System.out.println("Existem números iguais");
        }
        */

        //8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        // sabendo que a decisão é sempre pelo mais barato.

        /*
        System.out.println("Digite o preço do primeiro produto");
        double preco1 = scan.nextDouble();
        System.out.println("Digite o preço do segundo produto");
        double preco2 = scan.nextDouble();
        System.out.println("Digite o preço do terceiro produto");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Compre o primeiro produto");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Compre o segundo produto");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("Compre o terceiro produto");
        } else {
            System.out.println("Existem produtos com preços iguais");
        }
        */

        //9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

        /*
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            System.out.println(num3 + " - " + num1 + " - " + num2);
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            System.out.println(num1 + " - " + num3 + " - " + num2);
        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
        */

        //10.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino
        // ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!"
        // ou "Valor Inválido!", conforme o caso.

        /*
        System.out.println("Em que turno você estuda? Digite M para Matutino, V para Verpertino ou N para Noturno");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Turno inválido");
        }
        //pode ser feito com Switch
        */

         /*
        11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes. o Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual: o salários até R$ 280,00 (incluindo) : aumento de 20% o salários entre R$ 280,00 e R$ 700,00 : aumento de 15% o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela: o o salário antes do reajuste; o o percentual de aumento aplicado; o o valor do aumento; o o novo salário, após o aumento.
         */

        /*
        System.out.println("Digite seu salário em reais");
        double salario = scan.nextDouble();


        if (salario <= 280) {
            double valorAumento = (salario / 100) * 20;
            double salarioNovo = salario + valorAumento;
            System.out.println("Seu salário antes do reajuste é R$:" + salario);
            System.out.println("O percentual de aumento foi 20%");
            System.out.println("O valor do aumento foi: R$" + valorAumento);
            System.out.println("Seu salário após o reajuste será R$" + salarioNovo);

        } else if (salario > 280 && salario <= 700) {
            double valorAumento = (salario / 100) * 20;
            double salarioNovo = salario + valorAumento;

            System.out.println("Seu salário antes do reajuste é R$:" + salario);
            System.out.println("O percentual de aumento foi 15%");
            System.out.println("O valor do aumento foi: R$" + valorAumento);
            System.out.println("Seu salário após o reajuste será R$" + salarioNovo);

        } else if (salario > 750 && salario <= 1500) {
            double valorAumento = (salario / 100) * 5;
            double salarioNovo = salario + valorAumento;

            System.out.println("Seu salário antes do reajuste é R$:" + salario);
            System.out.println("O percentual de aumento foi 5%");
            System.out.println("O valor do aumento foi: R$" + valorAumento);
            System.out.println("Seu salário após o reajuste será R$" + salarioNovo);
        }
        */


        /*
        12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do
     salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. o Desconto do IR:
     o Salário Bruto até 900 (inclusive) - isento
     o Salário Bruto até 1500 (inclusive) - desconto de 5%
     o Salário Bruto até 2500 (inclusive) - desconto de 10%
     o Salário Bruto acima de 2500 - desconto de 20%
     Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220. Salário Bruto: (5 * 220) : R$ 1100,00 (-) IR (5%) : R$ 55,00 (-) INSS ( 10%) : R$ 110,00 FGTS (11%) : R$ 121,00 Total de descontos : R$ 165,00 Salário Liquido : R$ 935,00
         */

        /*
        System.out.println("Qual o valor da sua hora de trabalho?");
        double valorHora = scan.nextDouble();
        System.out.println("Qual foi a quantidade de horas trabalhadas esse mês?");
        double qtddHoras = scan.nextDouble();

        double salario = (valorHora * qtddHoras);
        //double sindicato = (salario / 100) * 3;
        double fgts = (salario / 100) * 11;
        double ir;
        double inss = (salario / 100) * 10;

        if (salario >= 900 && salario <= 1500) {
            ir = (salario / 100) * 5;
            //System.out.println("IR: " + ir);
        } else if (salario > 1500 && salario <= 2500) {
            ir = (salario / 100) * 10;
            //System.out.println("IR: " + ir);
        } else if (salario > 2500) {
            ir = (salario / 100) * 20;
            //System.out.println("IR: " + ir);
        } else {
            ir = 0;
            //System.out.println("IR: " + ir);
        }

        double salarioLiquido = (salario - ir - inss);
        double descontos = ir + inss;
        System.out.println("Salário Bruto: " + salario);
        System.out.println("IR: " + ir);
        System.out.println("INSS: " + inss);
        System.out.println("FGTS: "+ fgts);
        System.out.println("Total de Descontos: " + descontos);
        System.out.println("Salário Líquido: " + salarioLiquido);
        */

        /*
        13.Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
         */

        /*
        System.out.println("Digite um numero de 1 a 7 para o Dia da Semana");
        int diaDaSemana = scan.nextInt();

        switch(diaDaSemana) {
            case 1 :
                System.out.println("Domingo");
            break;
            case 2 :
                System.out.println("Segunda-feira");
            break;
            case 3:
                System.out.println("Terça-feira");
            break;
            case 4:
                System.out.println("Quarta-feira");
            break;
            case 5:
                System.out.println("Quinta-feira");
            break;
            case 6:
                System.out.println("Sexta-feira");
            break;
            case 7:
                System.out.println("Sábado");
            break;
            default :
                System.out.println("Número Invalido");
        }
        */

        /*
        14.Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        o Média de Aproveitamento Conceito
        o Entre 9.0 e 10.0 A
        o Entre 7.5 e 9.0 B
        o Entre 6.0 e 7.5 C
        o Entre 4.0 e 6.0 D
        o Entre 4.0 e zero E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
         */

        /*
        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();
        String conceito = " ";

        double media = (nota1 + nota2) / 2;
        System.out.println("A primeira nota foi: " + nota1);
        System.out.println("A segunda nota foi: " + nota2);
        System.out.println("A média das notas foi: " + media);

        if (media >= 9) {
            conceito = "A";
        } else if (media < 9 && media >= 7.5) {
            conceito = "B";
        } else if (media < 7.5 && media >=6) {
            conceito = "C";
        } else if (media < 6 && media >= 4) {
            conceito = "D";
        } else if (media < 4 && media == 0) {
            conceito = "E";
        } else {
            System.out.println("Verifique os valores");
        }

        System.out.println("O conceito foi: " + conceito);

        switch(conceito) {
            case "A":
            case "B":
            case "C":
                System.out.println("Você foi Aprovado");
                break;
            case "D":
            case "E":
                System.out.println("Você foi Reprovado");
                break;
            default:
                System.out.println("Conceito Inválido");
        }
        */


        /*
        15.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. o Dicas: o Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro; o Triângulo Equilátero: três lados iguais; o Triângulo Isósceles: quaisquer dois lados iguais; o Triângulo Escaleno: três lados diferentes;
         */

        /*
        System.out.println("Entre com o lado 1:");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 2:");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 3:");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado2 + lado3) > lado1)){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("não forma um triângulo");
        }
        */


        /*
        16.Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações: a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado; b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa; c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário; d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
         */

        /*
        17.Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
         */

        /*
        18.Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).
         */

        /*
        19.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é: . par ou ímpar; a. positivo ou negativo;
         */

        /*
        20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: . "Telefonou para a vítima?" a. "Esteve no local do crime?" b. "Mora perto da vítima?" c. "Devia para a vítima?" d. "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
         */

        /*
        21.Um posto está vendendo combustíveis com a seguinte tabela de descontos: . Álcool: a. até 20 litros, desconto de 3% por litro b. acima de 20 litros, desconto de 5% por litro Gasolina: c. até 20 litros, desconto de 4% por litro d. acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor a ser pago pelo cliente
       sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
         */

        /*
        22.Uma fruteira está vendendo frutas com a seguinte tabela de preços: Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80 por Kg R$ 1,50 por Kg Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
         */

        /*
        23.O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: o Até 5 Kg Acima de 5 Kg o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg o Picanha R$ 6,90 por Kg R$ 7,80 por Kg Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
         */
    }
}

