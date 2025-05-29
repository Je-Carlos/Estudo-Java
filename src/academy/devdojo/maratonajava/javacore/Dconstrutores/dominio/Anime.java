package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private int ano;
    private String estudio;

    // Construtor
    public Anime(String nome, int episodios, String genero, int ano) {
        this();
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.ano = ano;
    }

    public Anime(String nome, int episodios, String genero, int ano, String estudio) {
        this();
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.ano = ano;
        this.estudio = estudio;

    }

    // sobrecarga de construtor, tornando opcional paramêtros
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

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

    public void imprime() {
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.ano);
        System.out.println(this.estudio);
    }
}
