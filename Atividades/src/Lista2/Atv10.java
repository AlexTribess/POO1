package Lista2;

import java.util.Scanner;

public class Atv10 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double n1, n2, n3;

		System.out.println("Digite um valor: ");
		n1 = valor.nextDouble();

		System.out.println("Digite outro valor: ");
		n2 = valor.nextDouble();

		System.out.println("Digite outro valor: ");
		n3 = valor.nextDouble();

		if (n1 > n2 && n2 > n3) {
			System.out.println("O maior número é: " + n1 + " e o menor é: " + n3);
		} else if (n2 > n3 && n3 > n1) {
			System.out.println("O maior número é: " + n2 + " e o menor é: " + n1);
		} else if (n3 > n2 && n2 > n1) {
			System.out.println("O maior número é: " + n3 + " e o menor é: " + n1);
		}

		valor.close();
	}

}
