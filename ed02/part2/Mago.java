public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança magia!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        System.out.println(nome + " tenta se proteger com magia!");
        receberDano(dano);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo!");
        // Poderia causar dano em área. Aqui simula com ataque forte.
        ataqueBase += 10;
        System.out.println("Ataque mágico aumenta para " + ataqueBase);
    }
}
