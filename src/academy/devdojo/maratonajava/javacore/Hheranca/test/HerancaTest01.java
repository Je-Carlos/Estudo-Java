package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Astarion");
        endereco.setCep("12340-123");
        endereco.setRua("Rua Baldur");

        pessoa.setCpf("12341234");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("------");
        Funcionario funcionario = new Funcionario("Shadowheart");
        funcionario.setCpf("43214321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();

    }
}
