package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void init(String nome, int episodios, String genero){
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;

    }
    // sobrecarga
    public void init(String nome, int episodios, String genero, int ano){
        this.init(nome, episodios,genero);
        this.ano = ano;
    }
    public void imprime(){
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.nome);
    }
}
