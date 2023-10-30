package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil,estatura,cantidad_ahorrada,numero_hijos,fecha_nacimiento,hora_nacimiento)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setInt(7, persona.getNumeroHijos());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE personas" + "	SET nombre=?, apellido=?, estado_civil=?, estatura=?, fecha_nacimiento=?, "
							+ "hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=?" + "	WHERE cedula=?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setDouble(4, persona.getEstatura());
			ps.setDate(5, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(6, new Time(persona.getHoraNacimiento().getTime()));
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setInt(8, persona.getNumeroHijos());
			ps.setString(9, persona.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizarProducto(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE productos" + "	SET nombre=?, descripcion=?, precio=?, stock=?" + "	WHERE codigo=?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getDescripcion());
			ps.setBigDecimal(3, persona.getPrecio());
			ps.setDouble(4, persona.getStock());
			ps.setInt(5, persona.getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizarTransacciones(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("UPDATE transacciones"
					+ "	SET numero_cuenta=?, monto=?, tipo=?, fecha=?, hora=?" + "	WHERE codigo=?");

			ps.setString(1, persona.getNumeroCuenta());
			ps.setBigDecimal(2, persona.getMonto());
			ps.setString(3, persona.getTipo());
			ps.setDate(4, new java.sql.Date(persona.getFecha().getTime()));
			ps.setTime(5, new Time(persona.getHora().getTime()));

			ps.setInt(6, persona.getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from personas where cedula = ?");

			ps.setString(1, persona.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminarProducto(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from productos where codigo = ?");

			ps.setInt(1, persona.getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminarTransaccion(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from transacciones where codigo = ?");

			ps.setInt(1, persona.getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");

			rs = ps.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("nombre");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setCedula(nombre);
				personas.add(p);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return personas;
	}

	public static Persona buscarPorCodigo(int codigoBuscado) throws Exception {
		Persona produc1 = new Persona();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from productos where codigo = ?");
			ps.setInt(1, codigoBuscado);

			rs = ps.executeQuery();

			if (rs.next()) {
					String nombre = rs.getString("nombre");
					String descripcion = rs.getString("descripcion");
					BigDecimal precio =rs.getBigDecimal("Precio");
					int stock =rs.getInt("Stock");
					produc1.setNombre(nombre);
					produc1.setDescripcion(descripcion);
					produc1.setPrecio(precio);
					produc1.setStock(stock);
			}else {
				return null;
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return produc1;
	}
	
	public static ArrayList<Persona> buscarTransaccion(String tipo) throws Exception {
		ArrayList<Persona> transacciones = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from transacciones where tipo = ?");
			ps.setString(1, tipo);

			rs = ps.executeQuery();
			
			while (rs.next()) {
				int codigo = rs.getInt("codigo");
				String numeroCuenta = rs.getString("numero_cuenta");
				Date fecha = rs.getDate("fecha");
				Time hora = rs.getTime("hora");
				Persona p = new Persona();
				p.setCodigo(codigo);
				p.setNumeroCuenta(numeroCuenta);
				p.setFecha(fecha);
				p.setHora(hora);
				transacciones.add(p);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return transacciones;
	}
}
