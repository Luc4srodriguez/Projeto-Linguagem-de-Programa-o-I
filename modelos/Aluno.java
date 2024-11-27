package modelos;

import interfaces.AvaliacaoFisica;

public class Aluno extends Pessoa implements AvaliacaoFisica {
    private NivelTreino nivelTreino;

    public Aluno(String nome, int idade, NivelTreino nivelTreino) {
        super(nome, idade);
        this.nivelTreino = nivelTreino;
    }

    public NivelTreino getNivelTreino() {
        return nivelTreino;
    }

    @Override
    public void realizarAvaliacao() {
        System.out.println("Realizando avaliação física para o aluno " + getNome());
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório: Aluno " + getNome() + ", Nível: " + nivelTreino;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluno: " + getNome() + ", Idade: " + getIdade() + ", Nível: " + nivelTreino);
    }
}
