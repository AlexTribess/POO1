package Lista1;

import java.util.Scanner;

public class Atv8 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		System.out.println("Digite quanto voce ganha por hora: ");
		double sal = valor.nextDouble();

		System.out.println("Digite quantas horas voce trabalha por mês: ");
		double horas = valor.nextDouble();
		double mes = sal * horas;

		System.out.println("O seu salário mensal é de: " + mes);

		valor.close();
	}

}
