package academy.devdojo.maratonajava.introduction;

public class Aula4Operadores
{
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        System.out.println(num2-num1);

        // < > <= >= == !=
        boolean isDezMaior = 10 > 20;
        boolean isDezMenor = 10 < 20;
        System.out.println(isDezMaior);
        System.out.println(isDezMenor);

        // && || !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaior30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenor30 = idade < 30 && salario >= 3381;

        double valorTotalContaCorrent = 200;
        double valorTotalContaPoupanc = 10000;
        float valorPlay = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrent > 5000 || valorTotalContaPoupanc > valorPlay;
        System.out.println(isPlaystationCompravel);

        // = += -= *= /= %=
        double bonus = 1900;
        bonus += 1000;
        bonus -= 200;
        bonus *= 2;
        System.out.println(bonus);

        int contador = 0;
        int contador2 = 2;
        System.out.println(contador++);
        System.out.println(++contador2);
    }
}
