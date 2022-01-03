package curso_loiane.aulas.aula13;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Patricia";
        String segundoNome = "Novaes";
        System.out.println(primeiroNome + " " + segundoNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        //ou

        resultado++;
        System.out.println(resultado);

        //5
        System.out.println(resultado++); //primeiro imprime o valor do resultado depois incrementa (imprime 5 e soma 1)
        System.out.println(++resultado); // primeiro incrementa depois imprime o valor do resultado
    }
}
