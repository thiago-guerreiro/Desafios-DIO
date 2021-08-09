/*
Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e
uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia
considerando somente aqueles elementos que est�o abaixo da diagonal Secund�ria
da matriz, conforme ilustrado abaixo (�rea verde).

Entrada
A primeira linha de entrada cont�m um �nico caractere Mai�sculo O ('S' ou 'M'),
indicando a opera��o (Soma ou M�dia) que dever� ser realizada com os elementos
da matriz. Seguem os 144 valores de ponto flutuante que comp�em a matriz.

Sa�da
Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto
decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class AbaixoDiagonalSecundaria {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		double soma = 0;
		char O = scan.next().toUpperCase().charAt(0);
		double[][] M = new double[12][12];

		for (int i = 0; i < 12; ++i) {
			for (int j = 0; j < 12; ++j) {
				M[i][j] = scan.nextDouble();
			}
		}

		for (int i = 1; i < 12; ++i) {
			for (int j = 12 - i; j < 12; ++j) {
				soma += M[i][j];
			}
		}

		if (O == 'M')
			soma /= ((M.length * M.length) - 12) / 2;

		System.out.println(String.format("%.1f", soma));
		scan.close();
	}

}
