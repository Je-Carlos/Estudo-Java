package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome = "Teste";
    private int idade = 1;
    private double[] salarios = {1200.00, 1400.00, 2100.50};

    public void dadosFuncionario(){
        System.out.printf("Funcionário(a): %s\nIdade: %d\n", nome, idade);
        if (salarios == null){
            return;
        }
        System.out.print("Salários : ");

        for (double salario: salarios){
            System.out.print(salario + " ");
            System.out.println();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void mediaSalario(){
        if (salarios == null ){
            return;
        }
        double media = 0;
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.printf("Média Salarial: %2f", media);
    }


}
