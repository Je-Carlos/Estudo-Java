package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class CarroTestExercicio01 {

    // Crie uma classe carro com os seguintes atributos : nome, modelo, ano
// em seguida, crie dois objetos distintos e imprima seus valores
    public static void main(String[] args) {
        Carro carroModelo1 = new Carro();
        Carro carroModelo2 = new Carro();

        carroModelo2.nome = "BMW";
        carroModelo2.modelo = "BMW X5";
        carroModelo2.ano = 2024;

        carroModelo1.nome = "Hyundai";
        carroModelo1.modelo = "HB20";
        carroModelo1.ano = 2026;

        System.out.println("Nome do carro e modelo " + carroModelo2.nome + " " + carroModelo2.modelo + " Ano: " + carroModelo2.ano);
        System.out.println("Nome do carro e modelo " + carroModelo1.nome + " " + carroModelo1.modelo + " Ano: " + carroModelo1.ano);
    }


}
