package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//    1- Alocado espaco em memoria para o objeto
//    2- Cada atributo de classe é criado com valores default ou o que for passado
//    3- Bloco de inicialização é executado
//    4- Construtor é executado

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int ep : this.episodios) {
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
