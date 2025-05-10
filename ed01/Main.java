import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.println("🎮 Bem-vindo ao jogo de adivinhação!");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite um número entre 1 e 100: ");
            int tentativa = sc.nextInt();
            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.contains("Acertou")) {
                acertou = true;
            }
        }

        System.out.println("\n Tentativas: " + jogador.getTentativas());
        System.out.println(" Pontuação: " + jogador.getPontuacao());

        placar.adicionarJogador(jogador);
        placar.mostrarRanking();

        sc.close();
    }
}
