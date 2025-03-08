package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturaDeRepeticaoExercicio01 {
    public static void main(String[] args) {
        // Imprima de 1 a 100 todos os números pares usando estruturas de repeticao
        int valor = 0;
        for (int i=0; i<=100; i++ ){
            valor++;
            if (valor % 2 == 0){
                System.out.println(valor);
            }
        }
    }
}
