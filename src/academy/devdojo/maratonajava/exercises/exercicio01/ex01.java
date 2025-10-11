package academy.devdojo.maratonajava.exercises.exercicio01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C");
        int c = scanner.nextInt();

        int soma = a + b;
        System.out.println("A soma entre A + B é "+ soma);
        if (soma < c){
            System.out.println("O valor de A + B é menor que C");
        }
        scanner.close();
    }
}
