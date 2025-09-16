import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		final int TAM = 5;
		int[] numeros = new int[TAM];
		int soma = 0;
		int maior = 0;
		int menor = 0;

		for (int i = 0; i < TAM; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = valor.nextInt();
			soma += numeros[i];

			if (i == 0) {
				maior = numeros[i];
				menor = numeros[i];
			}

			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		double media = soma / (float) TAM;
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		valor.close();
	}
}
