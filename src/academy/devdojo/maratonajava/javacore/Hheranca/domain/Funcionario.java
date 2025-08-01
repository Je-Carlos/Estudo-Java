package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO ESTATICO DE Funcionario");
    }
    {
        System.out.println("DENTRO DO BLOCO INICIALIZAÇÃO Funcionario 1");
    }
    {
        System.out.println("DENTRO DO BLOCO INICIALIZAÇÃO Funcionario 2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi um salário de "+ this.salario);
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
