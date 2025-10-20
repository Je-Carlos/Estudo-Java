package academy.devdojo.maratonajava.exercises.exercicio09;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular seu IMC. Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura*altura);

        System.out.printf("IMC - %.2f", imc);
        if (imc <= 18.5){
            System.out.print("Abaixo do peso");
        } else if(imc < 25){
            System.out.print("Peso ideal (parabéns)");
        } else if (imc < 30) {
            System.out.print("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.print("Obesidade grau I");
        } else if(imc < 40){
            System.out.print("Obesidade grau II (severa)");
        } else {
            System.out.print("Obesidade grau III (mórbida)");
        }
    }
}
