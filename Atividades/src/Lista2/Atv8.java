package Lista2;

import java.util.Scanner;

public class Atv8 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		double[] notas = new double[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Digite uma nota: ");
			notas[i] = num.nextDouble();
		}
		double media = (notas[0] + notas[1]) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		num.close();
	}

}
