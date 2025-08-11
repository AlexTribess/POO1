package Lista2;

import java.util.Scanner;

public class Atv1 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num1 = num.nextDouble();
		System.out.println("Digite outro numero: ");
		double num2 = num.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O primeiro numero é maior");
		}
		else if(num2 > num1) {
			System.out.println("O segundo numero é maior");
		}
		else {
			System.out.println("Os números são iguais");
		}
	}
	
}
