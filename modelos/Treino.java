package modelos;

import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String nome;
    private NivelTreino nivel;
    private List<String> exercicios;

    public Treino(String nome, NivelTreino nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.exercicios = new ArrayList<>();
    }

    public void adicionarExercicio(String exercicio) {
        exercicios.add(exercicio);
    }

    public void exibirTreino() {
        System.out.println("Treino: " + nome + " (" + nivel + ")");
        System.out.println("Exercícios:");
        for (String exercicio : exercicios) {
            System.out.println("- " + exercicio);
        }
    }
}
