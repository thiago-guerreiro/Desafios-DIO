/*
Crie um programa onde voc� receber� valores inteiros n�o negativos como
entrada.

Ordene estes valores de acordo com o seguinte crit�rio:
- Primeiro os Pares
- Depois os �mpares
- Voc� deve exibir os pares em ordem crescente e na sequ�ncia os �mpares em
ordem decrescente.

- Entrada
A primeira linha de entrada cont�m um �nico inteiro positivo N (1 < N < 10000)
Este � o n�mero de linhas de entrada que vem logo a seguir. As pr�ximas N
linhas ter�o, cada uma delas, um valor inteiro n�o negativo.

- Sa�da
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada n�mero deve ser impresso em uma linha, conforme exemplo de sa�da abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class OrdenandoNumerosParesImpares {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int linhas = Integer.parseInt(st.nextToken());

		List<Integer> listaNumeros = new ArrayList<>();

		for (int i = 0; i < linhas; i++) {
			st = new StringTokenizer(br.readLine());
			listaNumeros.add(Integer.parseInt(st.nextToken()));
		}
		
		var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
		var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		List<Integer> total = new ArrayList<>();
		total.addAll(pares);
		total.addAll(impares);
		total.forEach(System.out::println);
	}

}
