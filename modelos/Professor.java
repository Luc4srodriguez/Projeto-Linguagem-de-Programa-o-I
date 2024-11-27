package modelos;

public class Professor extends Pessoa {
    private String especialidade;

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Professor: " + getNome() + ", Idade: " + getIdade() + ", Especialidade: " + especialidade);
    }
}
