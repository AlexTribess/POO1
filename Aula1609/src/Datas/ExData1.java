package Datas;

import java.util.Date;
import java.util.Calendar;

public class ExData1 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 26);
		calendario.set(Calendar.MONTH, 2);
		calendario.set(Calendar.YEAR, 2007);
		calendario.set(Calendar.HOUR_OF_DAY, 22);
		calendario.set(Calendar.MINUTE, 24);
		calendario.set(Calendar.SECOND, 43);
		Date dt = calendario.getTime();
		System.out.println("Nasci em: " + dt);
	}

}
