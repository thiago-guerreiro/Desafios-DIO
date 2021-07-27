/*
Voc� deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores
informados s�o pares, quantos valores informados s�o �mpares, quantos valores
informados s�o positivos e quantos valores informados s�o negativos.

Entrada
Voc� receber� 5 valores inteiros.

Sa�da
Exiba a mensagem conforme o exemplo de sa�da abaixo, sendo uma mensagem por linha
e n�o esquecendo o final de linha ap�s cada uma.
*/

import java.util.Scanner;

public class AnaliseDeNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;

		for (int i = 0; i < 5; i++) {
			n = scan.nextInt();
			if (n % 2 == 0)
				par += 1;
			if (n % 2 != 0)
				impar += 1;
			if (n > 0)
				positivo += 1;
			if (n < 0)
				negativo += 1;
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		scan.close();
	}
}
