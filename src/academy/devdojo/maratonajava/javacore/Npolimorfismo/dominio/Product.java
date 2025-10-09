package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Product implements Taxa{
    protected String nome;
    protected double valor;

    public Product(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
