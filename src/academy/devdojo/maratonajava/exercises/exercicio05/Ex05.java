package academy.devdojo.maratonajava.exercises.exercicio05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double salarioMinimo = 1631;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário ");
        double salario = scanner.nextDouble();

        double calculoSalario = salario/salarioMinimo;
        System.out.printf("Você recebe %s salários mínimo",String.format("%.2f", calculoSalario));
        scanner.close();
    }
}
