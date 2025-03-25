package academy.devdojo.maratonajava.introduction;

public class Aula07Array02 {
    public static void main(String[] args) {
        // valores padrão de inicialização
        // short, byte, int, float, double = 0
        // char = '\u0000' ''
        // boolean = false
        // String = null
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Kurapika";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
