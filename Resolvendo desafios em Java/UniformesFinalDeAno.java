import java.io.IOException;
import java.util.*;

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
