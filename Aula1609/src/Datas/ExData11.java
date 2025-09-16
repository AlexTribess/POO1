package Datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExData11 {
	public static void main(String[] args) {
		DateTimeFormatter dtfDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dt = LocalDateTime.parse("24/04/1978 15:01:27", dtfDataBrasil);
		System.out.println(dt);
	}

}
