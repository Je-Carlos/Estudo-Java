package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gyro", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Johnny", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente4);

        System.out.println(TipoPagamento.DEBITO.calcDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcDesconto(100));
    }
}
