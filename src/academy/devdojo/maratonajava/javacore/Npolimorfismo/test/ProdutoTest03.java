package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Celular;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Product product = new Computador("Ryzen 9", 4000);
        Celular cell = new Celular("Iphone 17 pro Max", 17000);
        cell.setFabricacao("11.09.2026");

        CalculadoraImposto.calcularImposto(cell);
        CalculadoraImposto.calcularImposto(product);
    }
}
