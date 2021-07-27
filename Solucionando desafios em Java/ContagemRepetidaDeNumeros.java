/*
Neste desafio sua tarefa ser� ler v�rios n�meros e em seguida dizer quantas vezes 
cada n�mero aparece, ou seja, deve-se escrever cada um dos valores distintos que 
aparecem na entrada por ordem crescente de valor.

Entrada
A primeira linha de entrada contem um �nico inteiro N, que indica a quantidade de 
valores que ser�o lidos para X (1 < N < 2000) logo em seguida. Com certeza cada 
n�mero n�o aparecer� mais do que 20 vezes na entrada de dados.

Sa�da
Imprima a sa�da de acordo com o exemplo fornecido abaixo, indicando quantas vezes 
cada um deles aparece na entrada por ordem crescente de valor.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaDeNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int valores = scan.nextInt();
		Map<Integer, Integer> numeros = new HashMap<>();

		for (int i = 0; i < valores; i++) {
			var numero = scan.nextInt();
			if (numeros.containsKey(numero)) {
				var qtde = numeros.get(numero);
				numeros.put(numero, ++qtde);
			} else {
				numeros.put(numero, 1);
			}
		}

		numeros.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
		
		scan.close();
	}

}
