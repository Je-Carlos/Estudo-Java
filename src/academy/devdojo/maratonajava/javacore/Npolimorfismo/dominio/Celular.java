package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Celular extends Product {
    public static final double IMPOSTO = 0.36;
    private int fabricacao;
    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcImposto() {
        System.out.println("Imposto sobre o produto: ");
        return this.valor * IMPOSTO;
    }

    public int getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }
}
