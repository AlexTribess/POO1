package Lista1;

import java.util.Scanner;

public class Atv7 {
	public static void main(String[] args) {
		Scanner lado = new Scanner(System.in);

		System.out.println("Digite o lado de um quadrado: ");
		double l = lado.nextDouble();
		double a = Math.pow(l,2);

		System.out.println("A área do quadrado é de: " + a);

		
		lado.close();
	}

}
