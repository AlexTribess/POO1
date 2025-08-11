package Lista2;

import java.util.Scanner;

public class Atv9 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double peso, altura, ideal;
		String sexo;

		System.out.println("Digite o seu peso: ");
		peso = valor.nextDouble();

		System.out.println("Digite a sua alutra: ");
		altura = valor.nextDouble();

		valor.nextLine();
		System.out.println("Digite o seu sexo: ");
		sexo = valor.nextLine();

		if (sexo.equalsIgnoreCase("masculino")) {
			ideal = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal é de: " + ideal);
		} else if (sexo.equalsIgnoreCase("feminino")) {
			ideal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é de: " + ideal);
		}

		valor.close();
	}

}
