package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionaisExercicio02 {
    public static void main(String[] args) {
        // Utilizando Switch e dado os valores 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
