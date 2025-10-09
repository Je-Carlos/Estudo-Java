package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Celular extends Product {
    public static final double IMPOSTO = 0.36;
    private String fabricacao;
    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcImposto() {
        return this.valor * IMPOSTO;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
}
