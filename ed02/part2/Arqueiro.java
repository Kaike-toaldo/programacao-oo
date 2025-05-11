import java.util.Random;

public class Arqueiro extends Personagem {
    private Random random = new Random();

    public Arqueiro(String nome) {
        super(nome, 120, 22);
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = random.nextBoolean(); // 50% de chance
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + (critico ? " acerta um crítico!" : " ataca com flecha."));
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        System.out.println(nome + " tenta esquivar!");
        receberDano(dano);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Flecha " + i + " lançada com força de " + ataqueBase);
        }
    }
}
