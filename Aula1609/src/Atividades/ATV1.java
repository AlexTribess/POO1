package Aula1609.src.Atividades;

import java.util.Calendar;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class ATV1 {

	private Calendar data = Calendar.getInstance();
	private DayOfWeek Dia1 = DayOfWeek.SATURDAY;
	private DayOfWeek Dia2 = DayOfWeek.SUNDAY;
	private LocalDate dt1 = LocalDate.of(1991, 11, 15);
	private LocalDate dt2 = LocalDate.of(2015, 11, 15);
	private int sabado = 0;
	private int domingo = 0;

	DayOfWeek diaDaSemana1 = dt1.getDayOfWeek();
	DayOfWeek diaDaSemana2 = dt2.getDayOfWeek();

	public DayOfWeek getDia1() {
		return Dia1;
	}

	public void setDia1(DayOfWeek diaDaSemana1) {
		Dia1 = diaDaSemana1;
	}

	public DayOfWeek getDia2() {
		return Dia2;
	}

	public void setDia2(DayOfWeek diaDaSemana2) {
		Dia2 = diaDaSemana2;
	}

	public LocalDate getDt1() {
		return dt1;
	}

	public void setDt1(LocalDate dt1) {
		this.dt1 = dt1;
	}

	public LocalDate getDt2() {
		return dt2;
	}

	public void setDt2(LocalDate dt2) {
		this.dt2 = dt2;
	}

	public int getSabado() {
		return sabado;
	}

	public void setSabado(int sabado) {
		this.sabado = sabado;
	}

	public int getDomingo() {
		return domingo;
	}

	public void setDomingo(int domingo) {
		this.domingo = domingo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void percorrerSemana() {
		while (!dt1.isAfter(dt2)) {
			
			if (diaDaSemana1.equals(DayOfWeek.SUNDAY)) {
				domingo += 1;
			}
			if (diaDaSemana1.equals(DayOfWeek.SATURDAY)) {
				sabado += 1;
			}
			if (diaDaSemana2.equals(DayOfWeek.SUNDAY)) {
				domingo += 1;
			}
			if (diaDaSemana2.equals(DayOfWeek.SATURDAY)) {
				sabado += 1;
			}
			dt1 = dt1.plusDays(1);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ Dia1 = ");
		builder.append(Dia1);
		builder.append(", Dia2 = ");
		builder.append(Dia2);
		builder.append(", dt1 = ");
		builder.append(dt1);
		builder.append(", dt2 = ");
		builder.append(dt2);
		builder.append(", sabado = ");
		builder.append(sabado);
		builder.append(", domingo = ");
		builder.append(domingo);
		builder.append("]");
		return builder.toString();
	}
}
