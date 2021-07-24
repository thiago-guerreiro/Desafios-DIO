/*
Leia um valor X. Coloque este valor na primeira posi��o de um vetor N[100].
Em cada posi��o subsequente de N (1 at� 99), coloque a metade do valor
armazenado na posi��o anterior, conforme o exemplo abaixo. Imprima o vetor N.

- Entrada
A entrada contem um valor de dupla precis�o com 4 casas decimais.

- Sa�da
Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor
e Y � o valor armazenado naquela posi��o. Cada valor do vetor deve ser
apresentado com 4 casas decimais.
*/

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoDeVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double X = 0;

		X = scan.nextDouble();
		BigDecimal[] N = new BigDecimal[100];
		N[0] = new BigDecimal(X);

		for (int i = 1; i < 100; ++i) {
			N[i] = N[i - 1].divide(new BigDecimal(2));
		}

		scan.close();
		DecimalFormat decFormat = new DecimalFormat("0.0000");

		for (int i = 0; i < 100; ++i) {
			System.out.println("N[" + i + "] = " + decFormat.format(N[i]));
		}
	}

}
