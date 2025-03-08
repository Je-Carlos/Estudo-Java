package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturaDeRepeticao02 {
    // Imprima os primeiros 25 numeros de 50 números
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
