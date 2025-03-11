package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 5) {
            System.out.println(++count);
        }

        for (int i = 0; i <= 10; i++){
            System.out.println("Eu repeti " + i + " vezes");
        }
    }
}
