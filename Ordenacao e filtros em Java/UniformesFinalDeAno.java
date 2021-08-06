/*
O professor Girafales organizou a confecção de um uniforme para as turmas
da escola para comemorar o final do ano. Após algumas conversas, ficou
decidido com os alunos que eles poderiam escolher a cor do uniforme entre
branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar
as listas de quem quer o uniforme em cada uma das turmas, relacionando estas
camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

- Entrada
Cada caso de teste inicia com um valor N, (1 < N < 60) inteiro e positivo, que
indica a quantidade de uniformes a serem feitas para aquela turma. As próximas
N*2 linhas contêm informações de cada um dos uniformes (serão duas linhas de
informação para cada uniforme). A primeira linha irá conter o nome do
estudante e a segunda linha irá conter a cor do uniforme ("branco" ou
"vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G".
A entrada termina quando o valor de N for igual a zero (0) e está valor não
deverá ser processado.

- Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela
cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por
último por ordem ascendente de nome, conforme o exemplo abaixo.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UniformesFinalDeAno {

	private String nome;
	private String tamanhoUniforme;
	private String corUniforme;

	public String getCorUniforme() {
		return this.corUniforme;
	}

	public void setCorUniforme(String corUniforme) {
		this.corUniforme = corUniforme;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanhoUniforme() {
		return this.tamanhoUniforme;
	}

	public void setTamanhoUniforme(String tamanhoUniforme) {
		this.tamanhoUniforme = tamanhoUniforme;
	}

	public UniformesFinalDeAno(String nome, String corUniforme, String tamanhoUniforme) {
		this.nome = nome;
		this.corUniforme = corUniforme;
		this.tamanhoUniforme = tamanhoUniforme;
	}

	public void printInfos() {
		System.out.println(this.corUniforme + " " + tamanhoUniforme + " " + nome);
	}

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();
		ArrayList<UniformesFinalDeAno> arrayUniformes = new ArrayList<>(N);
		String nome, uniformeDetalhes, corUniforme, tamanhoUniforme;

		for (int i = 0; i < N; i++) {
			nome = scan.nextLine();
			uniformeDetalhes = scan.nextLine();
			corUniforme = uniformeDetalhes.split(" ")[0];
			tamanhoUniforme = uniformeDetalhes.split(" ")[1];

			arrayUniformes.add(new UniformesFinalDeAno(nome, corUniforme, tamanhoUniforme));
		}

		scan.close();

		Collections.sort(arrayUniformes, new UniformeComparator());

		for (var item : arrayUniformes) {
			item.printInfos();
		}
	}

	static class UniformeComparator implements Comparator<UniformesFinalDeAno> {
		@Override
		public int compare(UniformesFinalDeAno estudante0, UniformesFinalDeAno estudante1) {
			int res = estudante0.corUniforme.compareTo(estudante1.corUniforme);

			if (res == 0) {
				res = estudante0.tamanhoUniforme.compareTo(estudante1.tamanhoUniforme);
				if (res == 0) {
					res = estudante0.nome.compareTo(estudante1.nome);
				} else {
					res = -res;
				}
			}

			return res;
		}
	}

}
