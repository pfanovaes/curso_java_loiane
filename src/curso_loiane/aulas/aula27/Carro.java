package curso_loiane.aulas.aula27;

public class Carro {

        String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonimia() {
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    //Qdo não tem a info como atributo, passa no parâmetro
    double calcularCombustivel(double km) {

        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
