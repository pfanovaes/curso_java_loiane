package curso_loiane.aulas.aula24.exercicios;

import java.util.Date;

public class Ex4 {
    /*
    4. Usando  o  resultado  do  modelo  “Livro”  como  base,  crie  uma  classe   “LivroDeBiblioteca”  que  represente  os  dados  básicos  de  um  livro  de  uma   biblioteca,  que  pode  ser  emprestado  a  leitores.
     */

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro = " + livro.nome);
    }
}
