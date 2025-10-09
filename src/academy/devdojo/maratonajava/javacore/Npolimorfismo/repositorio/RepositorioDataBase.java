package academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepositorioDataBase implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em database");
    }
}
