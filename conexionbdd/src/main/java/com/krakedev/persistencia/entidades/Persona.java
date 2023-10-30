package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private EstadoCivil estadoCivil;
	private int numeroHijos;
	private double estatura;
	private BigDecimal cantidadAhorrada;
	private Date fechaNacimiento;
	private Date horaNacimiento;
	
	private int codigo;
	private String descripcion;
	private BigDecimal precio;
	private int stock;
	
	private String numeroCuenta;
	private BigDecimal monto;
	private String tipo;
	private Date fecha;
	private Date hora;
	
	

	public Persona(int codigo, String numeroCuenta) {
		super();
		this.codigo = codigo;
		this.numeroCuenta = numeroCuenta;
	}
	public Persona(int codigo) {
		super();
		this.codigo = codigo;
	}
	public Persona(int codigo,String nombre , String descripcion) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	public Persona(int codigo, String numeroCuenta, BigDecimal monto, String tipo, Date fecha, Date hora) {
		super();
		this.codigo = codigo;
		this.numeroCuenta = numeroCuenta;
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
		this.hora = hora;
	}
	public Persona(String nombre, int codigo, String descripcion, BigDecimal precio, int stock) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public Persona() {
	}
	public Persona(String cedula) {
		super();
		this.cedula = cedula;
	}
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
	}
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numeroHijos,
			double estatura, BigDecimal cantidadAhorrada, Date fechaNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numeroHijos = numeroHijos;
		this.estatura = estatura;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}
	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getHoraNacimiento() {
		return horaNacimiento;
	}
	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numeroHijos=" + numeroHijos + ", estatura=" + estatura + ", cantidadAhorrada="
				+ cantidadAhorrada + ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento
				+ "]";
	}
}
