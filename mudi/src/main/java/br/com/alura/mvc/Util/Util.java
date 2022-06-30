package br.com.alura.mvc.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	public static LocalDate parseDate(String dataDaEntregaString) {
		
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(dataDaEntregaString, formatter);
		return ld;
	}
	
	

}
