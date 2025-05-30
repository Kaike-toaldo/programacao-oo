package ed04;

/**
 * Interface que define os métodos obrigatórios para um contato.
 */
public interface Contato {
    String getIdentificador();
    String getNome();
    String getTelefone();
    String getEmail();
    void setNome(String nome);
    void setTelefone(String telefone);
    void setEmail(String email);
}

