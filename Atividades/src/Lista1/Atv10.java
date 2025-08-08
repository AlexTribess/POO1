package Lista1;

import java.util.Scanner;

public class Atv10 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int num1 = num.nextInt();

		System.out.println("Digite outro número inteiro: ");
		int num2 = num.nextInt();

		System.out.println("Digite um número real: ");
		double num3 = num.nextDouble();

		double prod = (2 * num1) * (num2 / 2);
		double soma = (3 * num1) + num3;
		double cubo = Math.pow(num3, 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo: " + prod);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("O terceiro elevado ao cubo: " + cubo);
		
		num.close();
	}

}
