package Lista2;

import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		Scanner letras = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String c = letras.nextLine();
		if ((c.equalsIgnoreCase("a")) || (c.equalsIgnoreCase("e")) || (c == "i") || (c == "o") || (c == "u")) {
			System.out.println("É vogal");
		} else {
			System.out.println("Não é vogal");
		}
		letras.close();
	}

}
