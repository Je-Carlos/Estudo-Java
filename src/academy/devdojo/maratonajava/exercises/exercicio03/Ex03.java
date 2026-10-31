package academy.devdojo.maratonajava.exercises.exercicio03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorA = scanner.nextInt();

        System.out.println("Digite um outro valor: ");
        int valorB = scanner.nextInt();

        if (valorA == valorB){
            System.out.println("Os valores são iguais e por isso serão somados!");
            int valorC = valorA + valorB;
            System.out.print(valorC);
        } else {
            System.out.println("Os valores são diferentes e por isso serão multiplicados!");
            int valorC = valorA * valorB;
            System.out.println(valorC);
        }

        scanner.close();
    }


}
