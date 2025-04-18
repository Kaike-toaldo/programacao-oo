import java.util.Random;

/**
 * Gerencia a lógica do jogo de adivinhação.
 */
public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1; // de 1 a 100
    }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas();

        if (tentativa == numeroSecreto) {
            int pontos = 100 - jogador.getTentativas() + 1;
            jogador.atualizarPontuacao(pontos);
            return " Acertou! Número secreto: " + numeroSecreto;
        } else if (tentativa < numeroSecreto) {
            return "🔺 Maior!";
        } else {
            return "🔻 Menor!";
        }
    }
}
