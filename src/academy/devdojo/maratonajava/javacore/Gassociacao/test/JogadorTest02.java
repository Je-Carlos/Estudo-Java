package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador11 = new Jogador("Memphis");


        Time corinthians = new Time("Corinthians");

        jogador11.setTime(corinthians);

        jogador11.imprime();
    }
}
