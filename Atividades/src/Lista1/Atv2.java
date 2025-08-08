package Lista1;
import java.util.Scanner;

public class Atv2 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int numI = num.nextInt();
		System.out.println("O número informado foi: " + numI);

		num.close();
	}
}
