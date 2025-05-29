package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
//    0- Bloco de inicialização é executado quando a JVM carregar a classe
//    1- Alocado espaco em memoria para o objeto
//    2- Cada atributo de classe é criado com valores default ou o que for passado
//    3- Bloco de inicialização é executado
//    4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println("\n");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
