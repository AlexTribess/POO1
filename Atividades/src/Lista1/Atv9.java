package Lista1;

import java.util.Scanner;

public class Atv9 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite a temperatura em Farenheit: ");
		double far = num.nextDouble();
		double cel = (5 * (far - 32)) / 9;
		
		System.out.println("A temperatura em graus célsius é de: " + cel);
		
		num.close();
	}
}
