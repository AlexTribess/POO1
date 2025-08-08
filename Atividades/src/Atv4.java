import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		float nota1 = nota.nextFloat();

		System.out.println("Informe a segunda nota: ");
		float nota2 = nota.nextFloat();

		System.out.println("Informe a terceira nota: ");
		float nota3 = nota.nextFloat();

		System.out.println("Informe a quarta nota: ");
		float nota4 = nota.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média é de: " + media);
		
		nota.close();
	}

}
