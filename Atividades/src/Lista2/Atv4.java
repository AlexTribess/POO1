package Lista2;

import java.time.Year;
import java.util.Scanner;

public class Atv4 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digte em 4 digitos o ano: ");
		int ano = num.nextInt();

		if (Year.isLeap(ano)) {
			System.out.println("É ano bissexto");
		} else {
			System.out.println("Não é ano bissexto");
		}
		
		num.close();
	}

}
