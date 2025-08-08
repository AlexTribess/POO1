package Lista1;

import java.util.Scanner;

public class Atv13 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite o peso dos peixes em Kg: ");
		double peso = num.nextDouble();

		double excesso = Math.max(0, peso - 50);

		double multa = excesso * 4;

		System.out.println("O excesso é de: " + excesso);
		System.out.println("A multa é de: " + multa);

		num.close();
	}

}
