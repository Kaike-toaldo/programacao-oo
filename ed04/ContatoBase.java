package ed04;

/**
 * Classe abstrata que representa os atributos comuns de um contato.
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;

    public ContatoBase(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}

