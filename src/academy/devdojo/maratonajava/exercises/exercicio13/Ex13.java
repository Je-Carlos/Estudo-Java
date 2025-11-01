package academy.devdojo.maratonajava.exercises.exercicio13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println(nome + " Você possui " + idade + " anos " + "e é considerado Menor de Idade");
        } else {
            System.out.println(nome + " Você possui " + idade + " anos " + "e é considerado Maior de Idade");

        }
    }
}
