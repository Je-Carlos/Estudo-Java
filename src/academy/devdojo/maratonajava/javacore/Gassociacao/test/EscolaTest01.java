package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Iuri");
        Professor professor2 = new Professor("Robert");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Vila Sesámo", professores);

        escola.imprime();
    }
}
