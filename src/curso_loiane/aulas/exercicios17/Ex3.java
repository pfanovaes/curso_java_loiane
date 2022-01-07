package curso_loiane.aulas.exercicios17;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        3. Faça um programa que leia e valide as seguintes informações: a. Nome: maior que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que zero; d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
         */


        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite seu nome com mais de 3 caracteres");
            nome = scan.next();
            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("O nome precisa ter mais de 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite sua idade");
            idade = scan.nextInt();
            if (idade > 0 && idade < 150) {
                infoValida = true;
            } else {
                System.out.println("A idade precisa ser entre 0 e 150 anos");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu salário");
            salario = scan.nextDouble();
                if (salario > 0) {
                    infoValida = true;
                } else {
                    System.out.println("Seu salário precisa ser maior que zero");
                }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu sexo: f ou m");
            sexo = scan.next();
                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                    infoValida = true;
                } else {
                    System.out.println("Digite f para feminino ou m para masculino");
                }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu estado civil : s, c, v, d");
            estadoCivil = scan.next();
                if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                    infoValida = true;
                } else {
                    System.out.println("Seu estado civil deve ser s, c, v ou d");
                }
        } while (!infoValida);


    }
}
