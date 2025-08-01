package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
//    0- Bloco de inicialização estático  da super classe é executado quando a JVM carregar a classe pai
//    1- Bloco de inicialização estático  da super classe é executado quando a JVM carregar a classe filha
//    2- Alocado espaco em memoria para o objeto da super classe
//    3- Cada atributo de super classe pai é criado com valores default ou o que for passado da classe
//    4- Bloco de inicialização da super classe é executado na ordem que aparece
//    5- Construtor é executado da superclasse
//    6- Alocado espaco em memória pro objeto da subclasse
//    7- Cada atributo de subclasse é criado com valores default ou o que for passado da classe
//    8- Bloco de inicialização da subclasse é executado na ordem que aparece
//    9- Construtor é executado da subclasse
        Funcionario funcionario = new Funcionario("Sanji");
    }
}
