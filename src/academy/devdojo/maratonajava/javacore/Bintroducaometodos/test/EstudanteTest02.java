package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.name = "Doe";
        estudante1.age = 18;
        estudante1.gender = 'f';

        estudante2.name = "John";
        estudante2.age = 38;
        estudante2.gender = 'm';

        estudante1.imprime();
        estudante2.imprime();
    }
}
