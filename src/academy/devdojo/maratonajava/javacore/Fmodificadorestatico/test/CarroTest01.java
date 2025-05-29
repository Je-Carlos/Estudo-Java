package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carroModelo1 = new Carro("BMW", 280);
        Carro carroModelo2 = new Carro("Mercedes", 275);
        Carro carroModelo3 = new Carro("Audio", 290);

        Carro.setVelocidadeLimite(180);
        carroModelo1.imprime();
        carroModelo2.imprime();
        carroModelo3.imprime();
    }


}
