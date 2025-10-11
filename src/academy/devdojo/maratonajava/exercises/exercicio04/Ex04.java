package academy.devdojo.maratonajava.exercises.exercicio04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor qualquer");
        int valor = scanner.nextInt();

        System.out.println("Antecessor: " + --valor);
        valor++;
        System.out.println("Sucessor: "+ ++valor);
        scanner.close();
    }
}
