package curso_loiane.aulas.aula24.exercicios;

public class Ex2 {

    /*
    2. Crie  uma  classe  Livro  que  represente  os  dados  básicos  de  um  livro,  sem  se   preocupar  com  a  sua  finalidade.
     */

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);
    }
}
