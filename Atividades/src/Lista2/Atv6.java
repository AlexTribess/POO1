package Lista2;

import java.util.Scanner;

public class Atv6 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1, par, impar;
		n1 = num.nextInt();
		par = n1 + 1;

		if (n1 % 2 == 0) {
			System.out.println("Seu número foi: " + n1 + " e o número ímpar seria: " + par);
		} else {
			System.out.println("Seu número foi: " + n1 + " e o número par seria: " + par);
		}
		num.close();
	}

}
