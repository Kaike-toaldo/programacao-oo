package ed04;

import java.util.List;
import java.util.Scanner;

public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("\n=== AGENDA DE CONTATOS ===");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Listar Contatos");
        System.out.println("3 - Atualizar Contato");
        System.out.println("4 - Excluir Contato");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public int escolherTipoContato() {
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        System.out.print("Escolha o tipo de contato: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();
        return tipo;
    }

    public String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    /**
     * Lê o nome e valida se tem no mínimo 3 caracteres.
     */
    public String lerNomeValido(String mensagem) {
        String nome;
        do {
            nome = lerTexto(mensagem);
            if (nome.trim().length() < 3) {
                System.out.println("O nome deve ter no mínimo 3 caracteres. Tente novamente.");
            }
        } while (nome.trim().length() < 3);
        return nome;
    }

    public void exibirContatos(List<Contato> contatos) {
        System.out.println("\n--- Lista de Contatos ---");
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        System.out.printf("%-20s %-20s %-20s %-30s%n", "Identificador", "Nome", "Telefone", "Email");
        for (Contato c : contatos) {
            System.out.printf("%-20s %-20s %-20s %-30s%n",
                    c.getIdentificador(), c.getNome(), c.getTelefone(), c.getEmail());
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}



