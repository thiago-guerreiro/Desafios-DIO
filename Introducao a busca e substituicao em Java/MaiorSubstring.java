/*
Encontre a maior substring comum entre as duas strings informadas.
A substring pode ser qualquer parte da string, inclusive ela toda. Se n�o
houver subsequ�ncia comum, a sa�da deve ser �0�. A compara��o � case sensitive
('x' != 'X').

Entrada
A entrada cont�m v�rios casos de teste. Cada caso de teste � composto por duas
linhas, cada uma contendo uma string. Ambas strings de entrada cont�m entre 1
e 50 caracteres ('A'-'Z','a'-'z' ou espa�o ' '), inclusive, ou no m�nimo uma
letra ('A'-'Z','a'-'z').

Sa�da
O tamanho da maior subsequ�ncia comum entre as duas Strings.
*/

import java.util.Scanner;

public class MaiorSubstring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palavra1;
		String palavra2;

		while (scan.hasNextLine()) {
			palavra1 = scan.nextLine();
			palavra2 = scan.nextLine();
			int tamanhoMax = 0;

			if (palavra2.length() > palavra1.length()) {
				String maiorPalavra = palavra2;
				palavra2 = palavra1;
				palavra1 = maiorPalavra;
			}

			for (int i = 0; i < palavra2.length(); i++) {
				for (int j = 0; j < i + 1; j++) {
					if (palavra1.contains(palavra2.substring(j, palavra2.length() - i + j))) {
						tamanhoMax = Math.max(tamanhoMax, palavra2.length() - i);
					}
				}
			}

			System.out.println(tamanhoMax);
		}
		
		scan.close();
	}

}
