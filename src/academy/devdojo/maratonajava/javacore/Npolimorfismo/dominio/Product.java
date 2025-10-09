package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Product implements Taxa{
    protected String nome;
    protected double valor;

    public Product(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
