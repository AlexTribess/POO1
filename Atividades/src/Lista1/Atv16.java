package Lista1;

import java.util.Scanner;

public class Atv16 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite a area a ser pintada: ");
		double area = num.nextDouble();

		double litros = area / 6;

		double latas = Math.ceil(litros / 18);

		double galoes = Math.ceil(litros / 3.6);

		double valorL = latas * 80;

		double valorG = galoes * 25;

		System.out.println("Será preciso comprar: " + latas + " lata(s) por R$" + valorL + " ou " + galoes
				+ " galoes por R$" + valorG);

		num.close();
	}

}
