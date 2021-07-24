/*
Thor odeia pegar chuva, e para evit�-la ele come�ou a usar um sistema de
previs�o do tempo. Neste sistema ele consegue prever se ir� chover no hor�rio
em que ele vai para o trabalho e/ou no hor�rio que ele volta do trabalho.
Thor tamb�m odeia carregar guarda-chuva quando n�o est� chovendo. Para evitar
isso, ele vai comprar v�rios guarda-chuvas e deix�-los guardados em casa e no
escrit�rio, e s� vai us�-los quando estiver chovendo. Ou seja, se estiver
chovendo na hora de ir para o trabalho, ele vai pegar um guarda-chuva que est�
em sua casa, us�-lo no caminho para o trabalho, e deix�-lo l�. De maneira
semelhante, se estiver chovendo na hora de voltar para casa, ele vai pegar um
guarda-chuva que est� no escrit�rio, us�-lo no caminho para casa, e deix�-lo l�.
Dadas as previs�es meteorol�gicas, voc� ter� o desafio de descubrir quantos
guarda-chuvas Thor deve comprar e guardar em casa e no escrit�rio, de modo que
ele nunca se molhe e nunca precise carregar o guarda-chuva quando n�o estiver
chovendo.

- Entrada
A primeira linha da entrada cont�m um inteiro N, indicando a quantidade de
dias previstos pelo sistema meteorol�gico (1 <= N <= 1000).
Em seguida haver� N linhas, cada uma contendo duas palavras SD e SN, indicando
a previs�o do tempo para a ida e para a volta do trabalho, respectivamente. Se
a palavra for "sol" significa que neste hor�rio far� sol, e se a palavra for
"chuva" significa que neste hor�rio ir� chover.

- Sa�da
Para cada caso de teste imprima uma linha contendo dois inteiros C e E,
indicando quantos guarda-chuvas Rafael deve comprar e guardar em sua casa e
escrit�rio.
*/

import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int casaComprado = 0;
		int casaSobrando = 0;
		int trabComprado = 0;
		int trabSobrando = 0;
		String[] linha;
		String ida, volta;

		scan.nextLine();

		for (int i = 0; i < N; ++i) {
			linha = scan.nextLine().split(" ");
			ida = linha[0];
			volta = linha[1];
			if (ida.equals("chuva")) {
				if (casaSobrando > 0) {
					--casaSobrando;
				} else {
					casaComprado++;
				}
				trabSobrando++;
			}
			if (volta.equals("chuva")) {
				if (trabSobrando > 0) {
					--trabSobrando;
				} else {
					trabComprado++;
				}
				casaSobrando++;
			}
		}
		
		System.out.println(casaComprado + " " + trabComprado);
		scan.close();
	}

}
