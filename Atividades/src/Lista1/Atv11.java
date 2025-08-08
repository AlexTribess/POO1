package Lista1;

import java.util.Scanner;

public class Atv11 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite sua altura em centímetros: ");
		double altura = num.nextDouble();
		double cent = altura/100;
		double peso = (72.2 * cent) - 58;

		System.out.println("Seu peso ideal é de: " + peso);

		num.close();
	}

}
