/*
Ler um número inteiro N e calcular todos os seus divisores.

- Entrada
O arquivo de entrada contém um valor inteiro.

- Saída
Escreva todos os divisores positivos de N, um valor por linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class Divisores {
	
	public static void main(String[] args) throws IOException {
		
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	if (N % i == 0) System.out.println(i);
        }
        
        scan.close();
    }

}
