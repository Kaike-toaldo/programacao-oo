package ed04;

/**
 * Classe principal que executa a Agenda de Contatos.
 */
public class Main {
    public static void main(String[] args) {
        ContatoView view = new ContatoView();
        ContatoController controller = new ContatoController();

        boolean executando = true;

        while (executando) {
            int opcao = view.exibirMenu();

            switch (opcao) {
                case 1:
                    int tipo = view.escolherTipoContato();

                    String nome = view.lerNomeValido("Nome: ");
                    String telefone = view.lerTexto("Telefone: ");
                    String email = view.lerTexto("Email: ");
                    String id = (tipo == 1)
                            ? view.lerTexto("CPF (11 dígitos): ")
                            : view.lerTexto("CNPJ (14 dígitos): ");

                    if (tipo == 1 && id.replaceAll("\\D", "").length() != 11) {
                        view.exibirMensagem("CPF inválido. Deve conter 11 dígitos.");
                        break;
                    }
                    if (tipo == 2 && id.replaceAll("\\D", "").length() != 14) {
                        view.exibirMensagem("CNPJ inválido. Deve conter 14 dígitos.");
                        break;
                    }

                    Contato contato = (tipo == 1)
                            ? new PessoaFisica(nome, telefone, email, id)
                            : new PessoaJuridica(nome, telefone, email, id);

                    boolean sucesso = controller.adicionarContato(contato);
                    view.exibirMensagem(sucesso ? "Contato adicionado com sucesso." : "Contato já existe.");
                    break;

                case 2:
                    view.exibirContatos(controller.listarContatos());
                    break;

                case 3:
                    String idAtualizar = view.lerTexto("Informe o CPF ou CNPJ do contato a atualizar: ");
                    String novoNome = view.lerNomeValido("Novo Nome: ");
                    String novoTelefone = view.lerTexto("Novo Telefone: ");
                    String novoEmail = view.lerTexto("Novo Email: ");

                    boolean atualizado = controller.atualizarContato(idAtualizar, novoNome, novoTelefone, novoEmail);
                    view.exibirMensagem(atualizado ? "Contato atualizado." : "Contato não encontrado.");
                    break;

                case 4:
                    String idExcluir = view.lerTexto("Informe o CPF ou CNPJ do contato a excluir: ");
                    boolean excluido = controller.excluirContato(idExcluir);
                    view.exibirMensagem(excluido ? "Contato excluído." : "Contato não encontrado.");
                    break;

                case 0:
                    executando = false;
                    break;

                default:
                    view.exibirMensagem("Opção inválida.");
            }
        }

        view.exibirMensagem("Encerrando...");
    }
}



