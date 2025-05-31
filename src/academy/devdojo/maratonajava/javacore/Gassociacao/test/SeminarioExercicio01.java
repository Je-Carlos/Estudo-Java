package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.SeminarioExercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.SeminarioExercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.SeminarioExercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.SeminarioExercicio.Seminario;

public class SeminarioExercicio01 {
    /* Crie um sistema que gerencie seminários
     * O sistema deve cadastrar seminários, estudantes, professores e local onde será realizado o seminário
     *
     * Um aluno poderá estar em apenas um seminário
     * Um seminário poderá ter nenhum ou vários alunos
     * um professor poderá ter vários seminários
     * Um seminário deve ter um local
     *
     * Campos básicos (excluindo relacionamento)
     * seminário: titulo
     * aluno: nome e idade
     * professor: nome e especialidade
     * local: endereco
     * */
    public static void main(String[] args) {
        Local local = new Local("Baldurs Gate, Upper City");
        Aluno aluno = new Aluno("Wyll Ravenheart", 34);
        Professor professor = new Professor("Tav Dark Urge", "Bhaalspawn");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Como enfrentar Mindflayers", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.relatorio();

    }
}
