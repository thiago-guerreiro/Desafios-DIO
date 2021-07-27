/*
A f�rmula para calcular a �rea de uma circunfer�ncia �: area =  . raio2. 
Considerando para este problema que  = 3.14159:
- Efetue o c�lculo da �rea, elevando o valor de raio ao quadrado e 
multiplicando por .

Entrada
A entrada cont�m um valor de ponto flutuante (dupla precis�o), no caso, 
a vari�vel raio.

Sa�da
Apresentar a mensagem "A=" seguido pelo valor da vari�vel area, conforme exemplo
abaixo, com 4 casas ap�s o ponto decimal. Utilize vari�veis de dupla precis�o
(double). Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s 
o resultado, caso contr�rio, voc� receber� "Presentation Error".
*/

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double area;
		double raio;

		raio = scan.nextDouble();
		area = 3.14159 * (Math.pow(raio, 2));

		System.out.printf("A=%.4f\n", area);
		scan.close();
	}

}
