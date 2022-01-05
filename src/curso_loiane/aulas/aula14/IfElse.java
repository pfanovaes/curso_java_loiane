package curso_loiane.aulas.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        /*
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        if( idade >= 18 ) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }
        */

        //barato <= 10 reais
        // Entre 10 e 15 - pedir desconto
        // Entre 15 e 17 - pesquisar mais
        // >= 17 muito caro

        System.out.println("Entre com o preço do item");
        double preco = scan.nextDouble();

        if ( preco <= 10 ) {
            System.out.println("Compre, o produto está barato");
        } else if ( preco > 10 && preco < 15) {
            System.out.println("Peça Desconto");
        } else if ( preco >= 15 && preco < 17) {
            System.out.println("Pesquise mais");
        } else { //preco > 17
            System.out.println("Não compre");
        }

        //o else é opcional.



    }





}
