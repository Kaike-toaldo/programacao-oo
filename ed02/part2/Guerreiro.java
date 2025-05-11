public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com espada!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        System.out.println(nome + " defende com armadura! Dano reduzido para " + danoReduzido);
        receberDano(danoReduzido);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
        System.out.println("Ataque dobrado para " + ataqueBase);
    }
}
