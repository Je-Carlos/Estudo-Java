package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Product{
    public static final double IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcImposto() {
        System.out.println("Imposto sobre o produto: ");
        return this.valor * IMPOSTO;
    }
}
