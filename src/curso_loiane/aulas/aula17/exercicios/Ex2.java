package curso_loiane.aulas.aula17.exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
         */

        System.out.println("Digite um nome de usuário:");
        String nome = scan.next();

        System.out.println("Digite uma senha");
        String senha = scan.next();

        while ( nome.equalsIgnoreCase(senha)) {
            System.out.println("Usuário e senha iguais.");
            System.out.println("Digite um nome de usuário:");
            nome = scan.next();
            System.out.println("Digite uma senha");
            senha = scan.next();
        }

    }
}
