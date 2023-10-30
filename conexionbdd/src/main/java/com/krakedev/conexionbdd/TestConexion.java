package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estatura,cantidad_ahorrada,numero_hijos,fecha_nacimiento,hora_nacimiento)"
							+ "values (?,?,?,?,?,?,?,?)");
			ps.setString(1, "1723827432");
			ps.setString(2, "Mario");
			ps.setString(3, "Jimenez");
			ps.setDouble(4, 1.90);
			ps.setBigDecimal(5, new BigDecimal(8947.90));
			ps.setInt(6, 4);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				// crea un java.sql, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				ps.setDate(7, fechaSQL);
				ps.setTime(8, timeSQL);

				ps.executeUpdate();
				System.out.println("ejecuta insert");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Ceydis.159783");
			System.out.println("Conexion exitosa");

			ps = connection.prepareStatement(
					"insert into productos (codigo,nombre,descripcion,precio,stock)" + "values(?,?,?,?,?)");
			ps.setInt(1, 765342);
			ps.setString(2, "Folder");
			ps.setString(3, "Folder sin anillo");
			ps.setBigDecimal(4, new BigDecimal(150.11));
			ps.setInt(5, 23);

			ps.executeUpdate();
			System.out.println("ejecuta insert");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Ceydis.159783");
			System.out.println("Conexion exitosa");
			
			ps = connection.prepareStatement(
					"insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+ "values (?,?,?,?,?,?)");
			ps.setInt(1, 21);
			ps.setString(2, "156764");
			ps.setBigDecimal(3, new BigDecimal(8756.34));
			ps.setString(4, "D");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2001/05/03 08:31:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				// crea un java.sql, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);

				ps.executeUpdate();
				System.out.println("ejecuta insert");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
