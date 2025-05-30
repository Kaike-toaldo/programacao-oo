package ed04;

public interface Contato {
    String getIdentificador();
    String getNome();
    String getTelefone();
    String getEmail();
    void setNome(String nome);
    void setTelefone(String telefone);
    void setEmail(String email);
}

