package servicos;

import modelos.*;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademia {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Treino> treinos;

    public SistemaAcademia() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.treinos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }

    public void listarPessoas() {
        System.out.println("=== Alunos ===");
        for (Aluno aluno : alunos) {
            aluno.exibirDetalhes();
        }
        System.out.println("\n=== Professores ===");
        for (Professor professor : professores) {
            professor.exibirDetalhes();
        }
    }

    public void listarTreinos() {
        System.out.println("\n=== Treinos Disponíveis ===");
        for (Treino treino : treinos) {
            treino.exibirTreino();
        }
    }
}
