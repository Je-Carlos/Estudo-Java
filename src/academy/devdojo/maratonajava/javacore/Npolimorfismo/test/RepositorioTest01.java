package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.RepositorioArquivo;

public class RepositorioTest01 {
    public static void main(String[] args) {
        // Orientação orientada a interface ajuda a resolver problemas como esse, caso queira alterar aonde se salva.
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
