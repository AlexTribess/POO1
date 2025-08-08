package Lista1;

import java.util.Scanner;

public class Atv12 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite sua altura em centímetros: ");
		double altura = num.nextDouble();
		double cent = altura / 100;
		double masc = (72.7 * cent) - 58;
		double fem = (62.1 * cent) - 44.7;

		System.out.println("Para homem, o peso ideal é de: " + masc);
		System.out.println("Para mulher, o peso ideal é de: " + fem);

		num.close();
	}

}