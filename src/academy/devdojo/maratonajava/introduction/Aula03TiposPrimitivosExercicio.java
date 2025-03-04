package academy.devdojo.maratonajava.introduction;

import java.time.LocalDate;

/*
* Prática
* Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
* Eu <nome>, morando no endeço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Jean Carlos";
        String endereco = "Rua exemplo, 123";
        double salario = 3500.00;
        LocalDate data = LocalDate.now();

        System.out.println("Eu "+ nome + ", morando no endeço "+ endereco+", confirmo que recebi o salário de "+ salario +", na " +
                "data "+ data);
    }

}
