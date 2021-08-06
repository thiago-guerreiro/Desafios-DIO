/*
O banco que voc� trabalha sempre tem problemas para organizar as filas de
atendimento dos clientes.
Ap�s uma reuni�o com a ger�ncia ficou decidido que os clientes ao chegar na
ag�ncia receber�o uma senha num�rica em seu aparelho de celular via sms e que
a ordem da fila ser� dada n�o pela ordem de chegada, mas sim pelo n�mero
recebido via sms. Sendo, aqueles com n�mero maior dever�o ser atendidos primeiro. 
Ent�o, dada a ordem de chegada dos clientes reordene a fila de acordo com o
n�mero recebido via sms, e diga quantos clientes n�o precisaram trocar de
lugar nessa reordena��o.

- Entrada
A primeira linha cont�m um inteiro N, indicando o n�mero de casos de teste a
seguir.
Cada caso de teste inicia com um inteiro M (1 < M < 1000), indicando o n�mero
de clientes. Em seguida haver� M inteiros distintos Pi (1 < Pi < 1000), onde
o i-�simo inteiro indica o n�mero recebido via sms do i-�simo cliente.
Os inteiros acima s�o dados em ordem de chegada, ou seja, o primeiro inteiro
diz respeito ao primeiro cliente a chegar na fila, o segundo inteiro diz
respeito ao segundo cliente, e assim sucessivamente.

- Sa�da
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o
n�mero de clientes que n�o precisaram trocar de lugar mesmo ap�s a fila ser
reordenada.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilaDoBanco {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int linhas = Integer.parseInt(br.readLine());
		int qtdeNaoMudou;

		List<Integer> listaNumeros = new ArrayList<>();
		List<Integer> listaOrdenada = new ArrayList<>();

		for (int i = 0; i < linhas; i++) {
			qtdeNaoMudou = 0;
			var clientes = Integer.parseInt(br.readLine());
			var sms = br.readLine();

			listaNumeros.addAll(Arrays.stream(sms.split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
			listaOrdenada.addAll(listaNumeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

			for (int j = 0; j < clientes; j++) {
				if (listaNumeros.get(j).compareTo(listaOrdenada.get(j)) == 0) {
					qtdeNaoMudou++;
				}
			}

			System.out.println(qtdeNaoMudou);
			listaNumeros.clear();
			listaOrdenada.clear();
		}
	}

}
