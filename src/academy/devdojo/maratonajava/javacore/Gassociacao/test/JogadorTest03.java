package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Yuri Alberto");
        Jogador jogador2 = new Jogador("Breno Bidon");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador, jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("=== Jogador ===");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("=== Time ===");
        time.imprime();

    }
}
