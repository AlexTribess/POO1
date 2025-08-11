package Lista2;

import java.util.Scanner;

public class Atv3 {
	public static void main(String[] args) {
		Scanner letra = new Scanner(System.in);
		
		System.out.println("Digite M para masculino ou F para feminino: ");
		String letras = letra.nextLine();
		
		if (letras.equals("M")) {
			System.out.println("Masculino");
		}
		else if (letras.equals("F")) {
			System.out.println("Feminino");
		}
		letra.close();
	}

}
