package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturaDeRepeticaoExercicio02 {
    public static void main(String[] args) {
        /* Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
         * condição de valorParcela  >= 1000
         * */

        double valorCarro = 40000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            if (valorCarro / parcela < 1000) {
                break;
            }
            System.out.println("Parcela  " + parcela + "x de " + (valorCarro / parcela) + " reais");


        }
    }
}
