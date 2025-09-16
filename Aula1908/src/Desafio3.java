
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Desafio3 {
	public static void main(String[] args) {

		try {
			FileReader arq = new FileReader("/Aula1908/src/dna-1.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String seq = lerArq.readLine();

			char letraC = 'C';
			char letraA = 'A';
			char letraT = 'T';
			char letraG = 'G';
			boolean valida = false;
			int count = 0;

			for (int i = 0; i < seq.length(); i++) {
				if (seq.charAt(i) != letraT && seq.charAt(i) != letraC && seq.charAt(i) != letraG
						&& seq.charAt(i) != letraA) {
					valida = true;
				}
			}
			if (valida) {
				count++;
			}
			FileWriter writer = new FileWriter("dna.txt");

			writer.write("O total de fitas é " + "O total de fitas invalidas é " + count);

			writer.close();

			System.out.println("Arquivo criado");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}

	}
}
