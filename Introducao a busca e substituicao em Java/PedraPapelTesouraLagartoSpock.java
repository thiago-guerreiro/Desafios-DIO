/*
Pedra-papel-tesoura-lagarto-Spock � uma expans�o do cl�ssico m�todo de
sele��o em jogo de pedra-papel-tesoura. Atua sob o mesmo princ�pio b�sico,
mas inclui outras duas armas adicionais: o lagarto (formado pela m�o igual a
uma boca de fantoche) e Spock (formada pela sauda��o dos vulcanos em Star Trek).
Isso reduz as chances de uma rodada terminar em um empate. O jogo foi
inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock".
As regras de vantagem s�o as seguintes:
Tesoura corta papel
Papel cobre pedra
Pedra derruba lagarto
Lagarto adormece Spock
Spock derrete tesoura
Tesoura prende lagarto
Lagarto come papel
Papel refuta Spock
Spock vaporiza pedra
Pedra quebra tesoura

Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um
almo�o para o outro, com esta brincadeira. Sua miss�o ser� fazer um algoritmo
que, baseado no que eles escolherem, informe quem ir� ganhar ou se dar� empate.

Entrada
Haver� diversos casos de teste. O primeiro n�mero a ser lido ser� um inteiro,
representando a quantidade de casos de teste. Cada caso de teste tem duas
palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

Sa�da
Para cada caso de teste, imprima quem venceu, ou se houve empate.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PedraPapelTesouraLagartoSpock {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();

		scan.nextLine();
		List<Regra> regras = new ArrayList<>();
		regras.add(new Regra("tesoura", "papel"));
		regras.add(new Regra("papel", "pedra"));
		regras.add(new Regra("pedra", "lagarto"));
		regras.add(new Regra("lagarto", "spock"));
		regras.add(new Regra("spock", "tesoura"));
		regras.add(new Regra("tesoura", "lagarto"));
		regras.add(new Regra("lagarto", "papel"));
		regras.add(new Regra("papel", "spock"));
		regras.add(new Regra("spock", "pedra"));
		regras.add(new Regra("pedra", "tesoura"));

		for (int i = 0; i < casos; i++) {
			List<String> palavras = Arrays.asList(scan.nextLine().split(" "));
			if (palavras.get(0).equals(palavras.get(1))) {
				System.out.println("empate");
			} else {
				boolean primeiro = false;
				for (Regra r : regras) {
					if (r.getVence().equals(palavras.get(0)) && r.getPerde().equals(palavras.get(1))) {
						primeiro = true;
						break;
					}
				}

				if (primeiro) {
					System.out.println("fernanda");
				} else {
					System.out.println("marcia");
				}
			}
		}
		
		scan.close();
	}

	public static class Regra {
		private String vence;
		private String perde;

		public Regra(String vence, String perde) {
			this.vence = vence;
			this.perde = perde;
		}

		public String getVence() {
			return vence;
		}

		public void setVence(String vence) {
			this.vence = vence;
		}

		public String getPerde() {
			return perde;
		}

		public void setPerde(String perde) {
			this.perde = perde;
		}
	}

}
