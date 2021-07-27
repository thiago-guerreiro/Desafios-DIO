/*
Fa�a um algoritmo para ler um n�mero indeterminado de dados, contendo cada um, 
a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m 
o valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de indiv�duos.

Entrada
A entrada cont�m um n�mero indeterminado de inteiros. A entrada ser� encerrada 
quando um valor negativo for lido.

Sa�da
A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos.
A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		int soma = 0;
		int n = 0;

		do {
			n = scan.nextInt();
			if (n > 0) {
				cont++;
				soma += n;
			}
		} while (n > 0);

		double media = (double) soma / cont;
		System.out.println(String.format("%.2f", media));

		scan.close();
	}
}
