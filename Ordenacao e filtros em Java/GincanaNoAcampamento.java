/*
Nas f�rias de dezembro, v�rias escolas se organizam e levam seus alunos
para um acampamento de f�rias por uma semana. Nestes acampamentos os alunos
s�o divididos em cabanas coletivos por g�nero e idade, sempre com um adulto
que, al�m de dormir com o grupo na cabana, tamb�m s�o respons�veis por criar
e executar v�rias atividades, como por exemplo jogos, excurs�es, Gincanas
Noturnas, etc.
No primeiro dia foi realizada uma gincana em que a atividade constitu�a em
agrupar os alunos em um c�rculo (organizado no sentido anti-hor�rio) do qual
seriam retiradas uma a uma at� que sobrasse apenas um aluno, que seria o
vencedor.
No momento em que entra no c�rculo, cada aluno recebe uma pequena ficha que
cont�m um valor de 1 a 500. Depois que o c�rculo � formado, conta-se,
iniciando no aluno que est� ao lado da primeira que entrou no c�rculo, o
n�mero correspondente � ficha que o primeiro det�m. O aluno onde o n�mero
contado cair, deve ser retirado do grupo, e a contagem inicia novamente segundo
a ficha do aluno que acabou de ser eliminado. Para ficar mais interessante,
quando o valor que consta na ficha � par, a contagem � feita no sentido
hor�rio e quando o valor que consta na ficha � �mpar, a contagem � feita no
sentido anti-hor�rio.
Desenvolva um programa para que no pr�ximo evento o respons�vel pela
brincadeira saiba previamente qual crian�a ir� ser a vencedora de cada grupo,
com base nas informa��es fornecidas.

- Entrada
A entrada cont�m v�rios casos de teste. A primeira linha de cada caso de
teste cont�m um inteiro N (1 < N < 100), indicando a quantidade de alunos que
far�o parte de cada c�rculo. Em seguida, as N linhas de cada caso de teste
conter�o duas informa��es, o Nome e o Valor (1 < Valor < 500) que consta na
ficha de cada aluno, separados por um espa�o, na ordem de entrada na forma��o
do c�rculo inicial.
OBS: O Nome de cada aluno n�o dever� ultrapassar 30 caracteres e cont�m apenas
letras mai�sculas e min�sculas, sem acentos, e o caractere " _ ". O final da
entrada � indicado pelo n�mero zero.

- Sa�da
Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx,
com um espa�o ap�s o sinal ":" indicando qual � o aluno do grupo que venceu
a brincadeira.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaNoAcampamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> listaAlunos = new ArrayList<>();

		int numeroDeAlunos;
		String aluno;
		String valorFicha;
		int valorAtualFicha;
		int indiceAtual;
		int indiceAlunoEliminado;

		numeroDeAlunos = Integer.parseInt(scan.next());

		while (numeroDeAlunos > 0) {
			for (int i = 0; i < numeroDeAlunos; i++) {
				aluno = scan.next();
				valorFicha = scan.next();
				listaAlunos.add(aluno.trim() + " " + valorFicha.trim());
			}

			indiceAtual = 0;
			indiceAlunoEliminado = 0;
			valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAtual).split(" ")[1]);

			for (int i = 0; i < numeroDeAlunos - 1; i++) {
				if (valorAtualFicha == 0) {
					indiceAlunoEliminado = indiceAtual;
				} else if (valorAtualFicha % 2 == 0) {
					indiceAlunoEliminado = (listaAlunos.size() - (valorAtualFicha % listaAlunos.size()) + indiceAtual)
							% listaAlunos.size();
					valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).split(" ")[1]);
					listaAlunos.remove(indiceAlunoEliminado);
				} else if (valorAtualFicha % 2 != 0) {
					indiceAlunoEliminado = (valorAtualFicha % listaAlunos.size() + indiceAtual) % listaAlunos.size();
					valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).split(" ")[1]);
					listaAlunos.remove(indiceAlunoEliminado);
				}

				indiceAtual = (valorAtualFicha % 2 == 0)
						? ((indiceAlunoEliminado <= listaAlunos.size() - 1) ? indiceAlunoEliminado : 0)
						: ((indiceAlunoEliminado == 0) ? (listaAlunos.size() - 1) : (indiceAlunoEliminado - 1));
			}

			System.out.println("Vencedor(a): " + listaAlunos.get(0).split(" ")[0]);

			listaAlunos.clear();
			numeroDeAlunos = Integer.parseInt(scan.next());
		}

		scan.close();
	}

}
