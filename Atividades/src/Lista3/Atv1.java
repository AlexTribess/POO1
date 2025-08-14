package Lista3;

import java.util.Scanner;

public class Atv1 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		int num;

		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			num = valor.nextInt();

			if (num < 0 || num > 10) {
				System.out.println("Nota inválida, tente denovo");
			}
		} while (num < 0 || num > 10);

		System.out.println("Nota válida: " + num);
		valor.close();
	}
}
