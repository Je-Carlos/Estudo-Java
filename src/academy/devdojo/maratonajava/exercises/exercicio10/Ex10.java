package academy.devdojo.maratonajava.exercises.exercicio10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vamos calcular as 3 notas dos alunos\n");
        System.out.println("Insira o valor da primeira nota: ");
        double nota01 = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        double nota02 = scanner.nextDouble();
        System.out.println("Terceira nota: ");
        double nota03 = scanner.nextDouble();

        double formulaNota = (nota01 + nota02 + nota03)/3;

        if (formulaNota < 7){
            System.out.printf("Nota - %.2f\n", formulaNota);
            System.out.println("ALUNO REPROVADO");
        } else {
            System.out.printf("Nota - %.2f\n", formulaNota);
            System.out.println("ALUNO APROVADO!");
        }
        scanner.close();
    }
}
