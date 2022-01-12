###FOR
<hr>
Executa um bloco de código que está dentro do comando for, enquanto a condição for verdadeira.

for (inicializacao; condicao; atualizacao) {<br>
            // bloco de código<br>
}

###Tem variações:<br>
<u>Normal</u><br>

for (int i=0; i<5; i++) {<br>
System.out.println("i tem valor: " + i);<br>
}

<u>for com mais de uma variável<br></u>
for (int i = 0, j = 10; i < j; i++, j--) {<br>
System.out.println("i tem valor: " + i " e j tem valor: " + j);<br>
}<br>
<u>Partes ausentes</u><br>
<br>
int i = 0; <br>
for (; i<5; ) {<br>
System.out.println("i tem valor de " + i); <br>
i++; <br>
}<br>
<br>
<u>Loop sem corpo</u> <br>
<br>
int soma = 0;<br>
for(int i = 1; i < 5; soma+= i++) <br>
System.out.println("O valor da soma é:" + soma); <br>

Exercicios

11.Altere o programa anterior para mostrar no final a soma dos números. 12.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: o Tabuada de 5: o 5 X 1 = 5 o 5 X 2 = 10 o ... o 5 X 10 = 50
2.     13.Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem. 14.Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares. 15.A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo. 16.A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500. 17.Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 18.Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1. 19.Faça um programa que calcule o mostre a média aritmética de N notas. 20.Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. 21.Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos. 22.Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um. 23.O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu um tabela que contém o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços. Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos, conforme o exemplo abaixo: o Lojas Quase Dois - Tabela de preços o 1 - R$ 1.99 o 2 - R$ 3.98 o ... o 50 - R$ 99.50 24.O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
3.     o Preço do pão: R$ 0.18 o Panificadora Pão de Ontem - Tabela de preços o 1 - R$ 0.18 o 2 - R$ 0.36 o ... o 50 - R$ 9.00 25.O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo: o Lojas Tabajara o Produto 1: R$ 2.20 o Produto 2: R$ 5.80 o Produto 3: R$ 0 o Total: R$ 9.00 o Dinheiro: R$ 20.00 o Troco: R$ 11.00 o ... 26.Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo: o Fatorial de: 5 o 5! = 5 . 4 . 3 . 2 . 1 = 120 27.O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas. 28.Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. 29.Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário. 30.Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo: o Montar a tabuada de: 5
4.     o Começar por: 4 o Terminar em: 7 o o Vou montar a tabuada de 5 começando em 4 e terminando em 7: o 5 X 4 = 20 o 5 X 5 = 25 o 5 X 6 = 30 o 5 X 7 = 35 Obs: Você deve verificar se o usuário não digitou o final menor que o inicial. 31.Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que: . Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00; a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial; b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário. 32.O cardápio de uma lanchonete é o seguinte: o Especificação Código Preço o Cachorro Quente 100 R$ 1,20 o Bauru Simples 101 R$ 1,30 o Bauru com ovo 102 R$ 1,50 o Hambúrguer 103 R$ 1,20 o Cheeseburguer 104 R$ 1,30 o Refrigerante 105 R$ 1,00 Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado. 33.Faça um programa que mostre os n termos da Série a seguir: o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. Imprima no final a soma da série. 34.Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos. 35.Faça um programa que mostre os n termos da Série a seguir: o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. Imprima no final a soma da série.
5.     36.Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.