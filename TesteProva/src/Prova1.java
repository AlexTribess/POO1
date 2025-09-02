import java.util.Scanner;

public class Prova1 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		int soma = 0;
		double media = 0;
		int tam = 3;
		int[][] matriz = new int[tam][tam];

		for (int x = 0; x < tam; x++) {
			for (int y = 0; y < tam; y++) {
				System.out.println("Digite o numero da linha " + (x + 1) + " coluna " + (y + 1));
				matriz[x][y] = valor.nextInt();
			}
		}

		int maior = matriz[0][0];
		int menor = matriz[0][0];

		for (int x = 0; x < tam; x++) {
			for (int y = 0; y < tam; y++) {
				if (matriz[x][y] > maior) {
					maior = matriz[x][y];
				}
				if (matriz[x][y] < menor) {
					menor = matriz[x][y];
				}
				soma += matriz[x][y];
			}
		}
		int tamzin = tam * tam;
		media = soma / tamzin;
		String hash = "";
		for (int x = 0; x < tam; x++) {
			for (int y = 0; y < tam; y++) {
				for (int num = 0; num < matriz[x][y]; num++) {
					hash += "#";
				}
				System.out.println(matriz[x][y] + ": " + hash);
				hash = "";
			}
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		valor.close();
	}
}
