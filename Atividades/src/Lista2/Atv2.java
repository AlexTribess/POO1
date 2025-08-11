package Lista2;

import java.util.Scanner;

public class Atv2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n1 = num.nextInt();
		if (n1 > 0) {
			System.out.println("É positivo");
		}
		else if (n1 < 0) {
			System.out.println("É negativo");
		}
		else {
			System.out.println("É zero");
		}
		
		num.close();
	}

}
