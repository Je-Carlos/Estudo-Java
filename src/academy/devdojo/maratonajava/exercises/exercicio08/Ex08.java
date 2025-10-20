package academy.devdojo.maratonajava.exercises.exercicio08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.println("Digite 3 valores inteiros diferentes: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }
        Arrays.sort(valores);

        for (int i = valores.length-1; i >=0 ; i--) {
            System.out.println(valores[i]);
        }
    }
}
