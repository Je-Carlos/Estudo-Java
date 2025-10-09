package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Celular;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("AMD Ryzen 7 7800x3d", 2400);
        Celular celular = new Celular("Samsung s26 ultra", 5600);
        Televisao televisao = new Televisao("TV Samsung 70\" 2025", 2400);


        CalculadoraImposto.calcularImposto(celular);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(televisao);

    }
}
