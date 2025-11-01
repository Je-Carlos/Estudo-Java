package academy.devdojo.maratonajava.exercises.exercicio14;

public class Ex14 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int valorAuxiliar;

        System.out.println("Valor de A "+ A);
        System.out.println("Valor de B "+ B);

        System.out.println("Depois da troca ");
        valorAuxiliar = A;
        A = B;
        B = valorAuxiliar;

        System.out.println("Valor de A "+ A);
        System.out.println("Valor de B "+ B);


    }


}
