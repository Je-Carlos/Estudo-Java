package academy.devdojo.maratonajava.exercises.exercicio11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vamos calcular as 3 notas dos alunos\n");
        System.out.println("Nome do aluno - ");
        String nomeAluno = scanner.next();
        System.out.println("\nInsira o valor da primeira nota: ");
        double nota01 = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        double nota02 = scanner.nextDouble();
        System.out.println("Terceira nota: ");
        double nota03 = scanner.nextDouble();

        double formulaNota = (nota01 + nota02 + nota03)/3;

        if (formulaNota < 7){

            System.out.printf("Aluno - %s\n Nota - %.2f\n", nomeAluno, formulaNota);
            System.out.println("ALUNO REPROVADO");
        } else {
            System.out.printf("Aluno - %s\n Nota - %.2f\n", nomeAluno, formulaNota);
            System.out.println("ALUNO APROVADO!");
        }
        scanner.close();
    }
}
