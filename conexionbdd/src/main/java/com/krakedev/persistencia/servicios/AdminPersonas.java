package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	public static void insertar(Persona persona) {
	Connection con = ConexionBDD.conectar();
	try {
		
		System.out.println("Insertar");
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}finally{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error de infraestructura");

		}
	}

}
}
