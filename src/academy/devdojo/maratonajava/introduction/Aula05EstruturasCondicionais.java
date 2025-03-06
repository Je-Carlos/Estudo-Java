package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        // if
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (true) System.out.println("Dentro do if em 1 linha");

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Não autorizado a comprar bebidas");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

        // else

    }
}
