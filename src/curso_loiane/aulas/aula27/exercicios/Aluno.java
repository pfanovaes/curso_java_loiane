package curso_loiane.aulas.aula27.exercicios;

/*
    3. Escreva  uma  class  para  representar  um  Aluno.  Adicione  atributos   relacionados  às  caracteristicas  de  um  Aluno,  como  nome,  matricula,  curso   que  está  matriculado,  nome  de  3  disciplinas  que  está  cursando  e  as  notas   dessas  3  disciplinas.  Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  (nota  maior  ou  igual  a  7)  em  uma  determinada  disciplina.   Escreva  um  programa  para  testar  essa  classe,  que  pede  as  informações  do   aluno  ao  usuário  e  ao  final  informa  o  nome  das  disciplinas,  mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  não.
     */


import java.util.Scanner;

public class Aluno {

    Scanner scan = new Scanner(System.in);

    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome do aluno:");
        nome = scan.next();
        System.out.println("Número de Matrícula");
        matricula = scan.nextInt();
        System.out.println("Nome do curso:");
        curso = scan.next();

    }


}
