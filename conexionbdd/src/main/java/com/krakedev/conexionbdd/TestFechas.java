package com.krakedev.conexionbdd;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
	
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr="2020/03/22";
			try {
			Date fecha =sdf.parse(fechaStr);
			System.out.println(fecha);
			}catch (ParseException e) {
				e.printStackTrace();
			}
	}

}
