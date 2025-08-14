package Lista3;

import java.util.Scanner;

public class Atv3 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		String nome, sexo, civil;
		double idade, sal;

		do {
			System.out.println("Digite seu nome: ");
			nome = valor.nextLine();

			System.out.println("Digite sua idade: ");
			idade = valor.nextDouble();
			valor.nextLine();

			System.out.println("Digite seu salario: ");
			sal = valor.nextDouble();
			valor.nextLine();

			System.out.println("Digite seu sexo (F ou M): ");
			sexo = valor.nextLine();

			System.out.println("Digite seu estado civil (s, c, v ou d): ");
			civil = valor.nextLine();

			if (nome.length() < 3) {
				System.out.println("Nome tem menos de 3 caracteres");
			}
			if (idade < 0 || idade > 150) {
				System.out.println("Idade é maior que 150 ou menor que 0");
			}
			if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
				System.out.println("Sexo não definido corretamente, digite F ou M");
			}
			if (sal < 0) {
				System.out.println("Salario menor que 0");
			}
			if (!civil.equalsIgnoreCase("s") && !civil.equalsIgnoreCase("c") && !civil.equalsIgnoreCase("v")
					&& !civil.equalsIgnoreCase("d")) {
				System.out.println("Estado Civil inválido, digite 's', 'c', 'v' ou 'd'");
			}

		} while (nome.length() < 3 || idade < 0 || idade > 150 || sal < 0
				|| (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"))
				|| (!civil.equalsIgnoreCase("s") && !civil.equalsIgnoreCase("c") && !civil.equalsIgnoreCase("v")
						&& !civil.equalsIgnoreCase("d")));

		System.out.println("Dados salvos com sucesso");
		valor.close();
	}
}
