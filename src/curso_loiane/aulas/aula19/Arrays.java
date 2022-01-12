package curso_loiane.aulas.aula19;

public class Arrays {
    public static void main(String[] args) {
        //Armazenar a temperatura média diária por um ano.

        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        //criar e inicializar um array
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("Temperatura do primeiro dia: " + temperaturas[0]);
        System.out.println("Tamanho do array: " + temperaturas.length);
        System.out.println("Valores do array: " );

        for (int i = 0; i<temperaturas.length; i++) {
            System.out.println("A temperatura do dia " + (i + 1) + " foi " + temperaturas[i] );
        }

        //for simplificado
        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }
}
