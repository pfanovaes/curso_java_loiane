package curso_loiane.aulas.aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //métodos

    void exibirAutonomia() { //boas práticas nome de método sempre começa com verbo

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

}
