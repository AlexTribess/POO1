package Lista1;

import java.util.Scanner;

public class Atv14 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("Digite quanto voce ganha por hora: ");
		double sal = num.nextDouble();

		System.out.println("Digite quantas horas voce trabalha por mês: ");
		double horas = num.nextDouble();
		double salB = sal * horas;

		double ir = salB * 0.11;
		double inss = salB * 0.08;
		double sindi = salB * 0.05;
		double salL = salB - (ir + inss + sindi);

		System.out.println("Salario Bruto: R$" + salB + " - IR(11%): R$" + ir + " - INSS(8%): R$" + inss
				+ " - Sindicato(5%): R$" + sindi + " = Salário Liquido: R$" + salL);

		num.close();
	}

}
