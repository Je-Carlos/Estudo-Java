package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String next = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite M ou F para seu sexo");
        char sexo = input.next().charAt(0);

        System.out.printf("Nome %s\n Idade: %d\n Sexo: %c", next,idade,sexo);


    }

}
