/*
Rubens quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma
viagem de carro, sendo que seu carro faz 12 KM/L. Como ele n�o sabe fazer um 
programa que o auxilie nessa miss�o, ele te pede ajuda. Para efetuar o c�lculo, 
deve-se fornecer o tempo gasto em horas na viagem e a velocidade m�dia durante 
a mesma em km/h. Assim, voc� conseguir� passar para Rubens qual a dist�ncia 
percorrida e, em seguida, calcular quantos litros ser�o necess�rios para a viagem
que ele quer fazer. Mostre o valor com 3 casas decimais ap�s o ponto.

Entrada
O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem em 
horas e o segundo � a velocidade m�dia durante a mesma em km/h.

Sa�da
Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos 
ap�s o ponto decimal
*/

import java.util.Scanner;

public class CalculoDeViagem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double hora;
		double velocidade;

		hora = scan.nextDouble();
		velocidade = scan.nextDouble();

		System.out.printf("%.3f\n", (hora * velocidade) / 12.0);
		scan.close();
	}
}
