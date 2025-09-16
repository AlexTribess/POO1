
import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		final int LIN = 2;
		final int COL = 2;

		int[][] matriz = new int[LIN][COL];
		int soma = 0;
		int maior = 0;
		int menor = 0;

		for (int i = 0; i < LIN; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.println("Digite um numero para a matriz: ");
				matriz[i][j] = valor.nextInt();
				soma += matriz[i][j];

				if (i == 0 && j == 0) {
					maior = matriz[i][j];
					menor = matriz[i][j];
				}
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		for (int i = 0; i < LIN; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println(" ");
		}

		System.out.println("A soma da matriz é: " + soma);
		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);

		valor.close();
	}
}
