package Lista1;
import java.util.Scanner;

public class Atv5 {
	public static void main(String[] args) {
		Scanner metros = new Scanner(System.in);

		System.out.println("Digite uma medida em metros: ");
		float m = metros.nextFloat();
		float cm = m * 100;
		System.out.println("Em centímetros fica: " + cm);

		metros.close();
	}
}
