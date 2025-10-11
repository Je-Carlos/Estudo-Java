package academy.devdojo.maratonajava.exercises.exercicio02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor qualquer, negativo ou positivo ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) System.out.printf("O valor %d é par", valor);
        else System.out.printf("O valor %d é ímpar", valor);
        System.out.println();
        if (valor < 0) System.out.println("O valor é negativo");
        else System.out.println("O valor é positivo");

        scanner.close();
    }
}
