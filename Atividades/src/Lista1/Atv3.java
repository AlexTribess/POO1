package Lista1;
import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int num1 = num.nextInt();
		System.out.println("Informe outro número inteiro: ");
		int num2 = num.nextInt();
		int soma = num1 + num2;
		System.out.print("A soma é de: " + soma);
		
		num.close();
	}

}
