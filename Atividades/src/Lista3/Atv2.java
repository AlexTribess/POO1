package Lista3;

import java.util.Scanner;

public class Atv2 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		String nome, senha;

		do {
			System.out.println("Digite o nome de usuario: ");
			nome = valor.nextLine();

			System.out.println("Digite a senha: ");
			senha = valor.nextLine();
			if (senha.equals(nome)) {
				System.out.println("Erro, a senha é igual ao nome, tente novamente: ");

			}

		} while (senha.equals(nome));

		System.out.println("Login feito com sucesso");
		valor.close();
	}

}
