package Lista1;

import java.util.Scanner;

public class Atv6 {
	public static void main(String[] args) {
		Scanner raio = new Scanner(System.in);

		System.out.println("Digite o raio de um círculo: ");
		double r = raio.nextDouble();
		double area = Math.pow(r, 2);
		double area2 = area * 3.14;

		System.out.print("A area é de: " + area2);

		raio.close();
	}

}
