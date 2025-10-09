package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Product;

public class CalculadoraImposto {

    public static void calcularImposto(Product product){
        System.out.println("Relatório de imposto");
        double imposto = product.calcImposto();
        System.out.println("Produto: " + product.getNome());
        System.out.println("Valor: " + product.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
