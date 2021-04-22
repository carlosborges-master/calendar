package Course;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programam {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date dt = sdf.parse("28/07/2021 15:30:02");
		
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(dt));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		
		System.out.println("Adicionou 4 horas " + sdf.format(d));
		System.out.println("minutos = " + minutes);
		System.out.println("Mês = " + mes);
	}

}
