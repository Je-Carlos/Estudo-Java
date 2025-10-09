package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Celular;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;

public class CalculadoraImposto {
    public static void calcImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcImposto();
        System.out.println("Computador "+ computador.getNome());
        System.out.println("Valor "+ computador.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }

    public static void calcImpostoCelular(Celular celular){
        System.out.println("Relatório de imposto do celular");
        double imposto = celular.calcImposto();
        System.out.println("Celular "+ celular.getNome());
        System.out.println("Valor "+ celular.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }
}
