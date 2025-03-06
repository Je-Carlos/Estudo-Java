package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade > 15 -> categoria infantil
        // idade >= 15 && idade < 18 -> categoria juvenil
        // idade >= 18 -> categoria adulto
        int idade = (int)(Math.random() * 26 + 1);

        if (idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria adulto");
        }

        // String categoria = idade < 15 ? "Categoria infantil" : idade < 18 ? "Categoria Juvenil" : "Categoria adulto";
        System.out.println(idade);
    }
}
