package academy.devdojo.maratonajava.introduction;
// Eu quero saber quanto eu pago de taxas nos paises baixos, de acordo com minha base salarial

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 70000;

        if(salarioAnual <= 38.441) {
            System.out.println("Seu salário é de " + salarioAnual+" portanto, você pagará " + (salarioAnual * 0.3582));
        } else if (salarioAnual <= 76.817) {
            System.out.println("Seu salário é de " + salarioAnual+" portanto, você pagará " + (salarioAnual * 0.3748));
        } else {
            System.out.println("Seu salário é de " + salarioAnual+" portanto, você pagará " + (salarioAnual * 0.4950));

        }
    }

}
