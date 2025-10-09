package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Product{
    public static final double IMPOSTO = 0.10;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcImposto() {
        return this.valor * IMPOSTO;
    }

}
