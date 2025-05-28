package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João Pedro";
        funcionario.idade = 35;
        funcionario.salarios = new double[]{1300, 1920, 2000};

        funcionario.dadosFuncionario();
        funcionario.mediaSalario();
    }
}
