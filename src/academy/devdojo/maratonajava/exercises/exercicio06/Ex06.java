package academy.devdojo.maratonajava.exercises.exercicio06;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um valor numérico: ");
        double valor = scanner.nextDouble();
        double reajuste = valor + (valor * 0.05);
        System.out.println("O valor com reajuste de 5% é de " + reajuste);

        scanner.close();
    }
}
