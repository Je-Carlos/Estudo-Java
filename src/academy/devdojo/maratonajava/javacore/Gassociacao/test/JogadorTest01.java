package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

    Jogador jogador1 = new Jogador("Cassio");
    Jogador jogador2 = new Jogador("Yuri Alberto");
    Jogador jogador3 = new Jogador("Memphis Depay");

    Jogador[] jogadoresCorinthians = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadoresCorinthians) {
            jogador.imprime();
        }

    }

}
