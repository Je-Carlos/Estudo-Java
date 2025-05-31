package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoExercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double answer = (int)(Math.random() * 101); // 0 - 100
        System.out.println("=== Previsão do futuro para as maiores revelações do mundo ===");
        System.out.println("Faça sua pergunta e responderei SIM ou NÃO");
        String question = input.nextLine();

        if (answer >= 50) System.out.println("SIM");
        else System.out.println("NÃO");
    }
}
