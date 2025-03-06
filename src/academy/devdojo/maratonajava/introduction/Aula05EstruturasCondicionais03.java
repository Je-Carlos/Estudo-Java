package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 para as ONGs felinas";
        String mensagemNaoDoar = "Ainda não consigo, mas vou ter";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
