package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 33;
        professor.sexo = 'f';
        professor.nome = "Carla";
        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo:" + professor.sexo);
    }
}
