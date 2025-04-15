package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.name = "Doe";
        estudante1.age = 18;
        estudante1.gender = 'f';

        estudante2.name = "John";
        estudante2.age = 38;
        estudante2.gender = 'm';


        System.out.println(estudante1.name);
        System.out.println(estudante1.age);
        System.out.println(estudante1.gender);

        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.gender);

        System.out.println("---------");

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
