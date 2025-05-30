package ed04;

import java.util.ArrayList;
import java.util.List;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public boolean adicionarContato(Contato contato) {
        if (buscarContato(contato.getIdentificador()) != null) {
            return false;
        }
        contatos.add(contato);
        return true;
    }

    public List<Contato> listarContatos() {
        return contatos;
    }

    public Contato buscarContato(String identificador) {
        for (Contato c : contatos) {
            if (c.getIdentificador().equals(identificador)) {
                return c;
            }
        }
        return null;
    }

    public boolean atualizarContato(String identificador, String nome, String telefone, String email) {
        Contato contato = buscarContato(identificador);
        if (contato != null) {
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);
            return true;
        }
        return false;
    }

    public boolean excluirContato(String identificador) {
        Contato contato = buscarContato(identificador);
        if (contato != null) {
            contatos.remove(contato);
            return true;
        }
        return false;
    }
}

