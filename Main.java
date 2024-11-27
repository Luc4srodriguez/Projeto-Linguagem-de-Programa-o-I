import modelos.*;
import servicos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAcademia sistema = new SistemaAcademia();

        int opcao;

        do {
            System.out.println("\n=== Sistema de Gerenciamento da Academia ===");
            System.out.println("1. Cadastro de Aluno");
            System.out.println("2. Cadastro de Professor");
            System.out.println("3. Ver Treinos e Exercícios");
            System.out.println("4. Relatório Completo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner, sistema);
                    break;
                case 2:
                    cadastrarProfessor(scanner, sistema);
                    break;
                case 3:
                    visualizarTreinos();
                    break;
                case 4:
                    exibirRelatorio(sistema);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarAluno(Scanner scanner, SistemaAcademia sistema) {
        System.out.print("Nome do Aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nível do Treino (Iniciante, Intermediário, Avançado): ");
        String nivel = scanner.nextLine().toUpperCase();

        if (nivel.equals("INICIANTE") || nivel.equals("INTERMEDIARIO") || nivel.equals("AVANCADO")) {
            Aluno aluno = new Aluno(nome, idade, NivelTreino.valueOf(nivel));
            sistema.adicionarAluno(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Nível de treino inválido! Aluno não cadastrado.");
        }
    }

    private static void cadastrarProfessor(Scanner scanner, SistemaAcademia sistema) {
        System.out.print("Nome do Professor: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Professor: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        Professor professor = new Professor(nome, idade, especialidade);
        sistema.adicionarProfessor(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }

    private static void visualizarTreinos() {
        System.out.println("\n=== Treinos Disponíveis ===");
        Treino treino1 = new Treino("Treino A", NivelTreino.INICIANTE);
        treino1.adicionarExercicio("Supino");
        treino1.adicionarExercicio("Agachamento");
        treino1.exibirTreino();

        Treino treino2 = new Treino("Treino B", NivelTreino.INTERMEDIARIO);
        treino2.adicionarExercicio("Extensão de quadril");
        treino2.adicionarExercicio("Agachamento com abdução alternada");
        treino2.exibirTreino();

        Treino treino3 = new Treino("Treino C",NivelTreino.AVANCADO);
        treino3.adicionarExercicio("Treino pirâmide");
        treino3.adicionarExercicio("Agachamento + cadeira extensora");
        treino3.exibirTreino();
    }

    private static void exibirRelatorio(SistemaAcademia sistema) {
        System.out.println("\n=== Relatório Completo ===");
        sistema.listarPessoas();
        visualizarTreinos();
    }
}