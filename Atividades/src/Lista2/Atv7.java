package Lista2;

import java.util.Scanner;
import java.util.Arrays;

public class Atv7 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int[] ns = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			ns[i] = n.nextInt();
		}
		Arrays.sort(ns);

		System.out.println("Os numeros em forma ordenada fica: ");
		for (int num : ns) {
			System.out.println(num + " ");
		}

		n.close();
	}

}
