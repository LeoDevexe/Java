package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion {
	public static void main (String [] args) {
		Connection connection = null;
		PreparedStatement ps= null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			System.out.println("Conexión exitosa");
			ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estados_civil_codigo)"+"values(?,?,?,?)");
			
			
			ps.setString(1,"1750496558");
			ps.setString(2,"Maria");
			ps.setString(3,"Obando");
			ps.setString(4,"U");
			
			ps.executeUpdate();
			System.out.println("Ejecuta insert");
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	}

}
