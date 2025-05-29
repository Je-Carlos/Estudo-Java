package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jojo's bizarre adventure", 12, "Isekai", 1997, "David Production");

        anime.imprime();

    }
}
