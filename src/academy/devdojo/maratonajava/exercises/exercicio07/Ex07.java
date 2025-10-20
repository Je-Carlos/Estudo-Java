package academy.devdojo.maratonajava.exercises.exercicio07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor booleano (true ou false) - ");
        boolean valor1 = scanner.nextBoolean();
        System.out.println();
        System.out.print("Digite outro valor booleano (true ou false) - ");
        boolean valor2 = scanner.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Ambos são verdadeiros");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos são falsos");
        } else {
            System.out.println("Verdadeiro e Falso");
        }
    }
}
