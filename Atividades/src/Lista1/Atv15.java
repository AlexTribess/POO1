package Lista1;

import java.util.Scanner;

public class Atv15 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite a area a ser pintada: ");
		double area = num.nextDouble();

		double litros = area / 3;

		double latas = Math.ceil(litros / 18);

		double valor = latas * 80;

		System.out.println("Será preciso comprar: " + latas + " lata(s) com o valor de: R$" + valor);

		num.close();
	}

}
