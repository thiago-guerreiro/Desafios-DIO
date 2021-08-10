/*
Pedro e Fernando s�o os desenvolvedores em uma stratup e v�o desenvolver o
novo sistema de cadastro, e pediram a sua ajuda. Sua task � fazer o c�digo que
valide as senhas que s�o cadastradas, para isso voc� deve atentar aos
requisitos a seguir:
A senha deve conter, no m�nimo, uma letra mai�scula, uma letra min�scula e
um n�mero;
A mesma n�o pode ter nenhum caractere de pontua��o, acentua��o ou espa�o;
Al�m disso, a senha pode ter de 6 a 32 caracteres.

Entrada
A entrada cont�m v�rios casos de teste e termina com final de arquivo. Cada
linha tem uma string S, correspondente a senha que � inserida pelo usu�rio
no momento do cadastro.

Sa�da
A sa�da cont�m uma linha, que pode ser Senha valida, caso a senha tenha
cada item dos requisitos solicitados anteriormente, ou �Senha invalida.�,
se um ou mais requisitos n�o forem atendidos. */

import java.util.Scanner;

public class ValidadorDeSenhas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String senha;
		
		final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
		final String permitidos = "[a-zA-Z0-9]+";

		while (scan.hasNextLine()) {
			senha = scan.nextLine();

			if (senha.length() >= 6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)) {
				System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}
		}
		
		scan.close();
	}

}
