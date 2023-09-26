package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.*;

public class MaquinaDulces {
	public Celda getCelda1() {
		return Celda1;
	}

	public void setCelda1(Celda celda1) {
		Celda1 = celda1;
	}

	public Celda getCelda2() {
		return Celda2;
	}

	public void setCelda2(Celda celda2) {
		Celda2 = celda2;
	}

	public Celda getCelda3() {
		return Celda3;
	}

	public void setCelda3(Celda celda3) {
		Celda3 = celda3;
	}

	public Celda getCelda4() {
		return Celda4;
	}

	public void setCelda4(Celda celda4) {
		Celda4 = celda4;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	private Celda Celda1;

	public MaquinaDulces(Celda celda1, Celda celda2, Celda celda3, Celda celda4, double saldo) {

		Celda1 = celda1;
		Celda2 = celda2;
		Celda3 = celda3;
		Celda4 = celda4;
		Saldo = saldo;
	}

	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		Celda1 = new Celda(codigoCelda1);
		Celda2 = new Celda(codigoCelda2);
		Celda3 = new Celda(codigoCelda3);
		Celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + Celda1.getCodigo());
		System.out.println("Celda 2: " + Celda2.getCodigo());
		System.out.println("Celda 3: " + Celda3.getCodigo());
		System.out.println("Celda 4: " + Celda4.getCodigo());
		System.out.println("Saldo actual: " + Saldo);
	}

	public Celda buscarCelda(String codigo) {
		if (Celda1 != null && Celda1.getCodigo().equals(codigo)) {
			return Celda1;
		} else if (Celda2 != null && Celda2.getCodigo().equals(codigo)) {
			return Celda2;
		} else if (Celda3 != null && Celda3.getCodigo().equals(codigo)) {
			return Celda3;
		} else if (Celda4 != null && Celda4.getCodigo().equals(codigo)) {
			return Celda4;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		} else {
			System.out.println("La celda no tiene producto");
		}
	}

	public void mostrarProductos() {
		if (Celda1 != null && Celda1.getProducto() != null) {
			System.out.println("*********Celda A1 ");
			
			System.out.println("Stock: " + Celda1.getStock());
			System.out.println("Nombre: " + Celda1.getProducto().getNombre());
			System.out.println("Precio: " + Celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + Celda1.getProducto().getCodigo());

		} else {
			System.out.println("*********Celda A1 ");
			System.out.println("Stock: " + Celda1.getStock());
			System.out.println("La celda no tiene producto");
			

		}

		if (Celda2 != null && Celda2.getProducto() != null) {
			System.out.println("Celda A2 - Código: " + Celda2.getCodigo());
			System.out.println("Stock: " + Celda2.getStock());
			System.out.println("Nombre: " + Celda2.getProducto().getNombre());
			System.out.println("Precio: " + Celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + Celda2.getProducto().getCodigo());

		} else {
			System.out.println("*********Celda A2 ");
			System.out.println("Stock: " + Celda2.getStock());
			System.out.println("La celda no tiene producto");
			

		}

		if (Celda3 != null && Celda3.getProducto() != null) {
			System.out.println("*********Celda B1 ");
			System.out.println("Stock: " + Celda3.getStock());
			System.out.println("Nombre: " + Celda3.getProducto().getNombre());
			System.out.println("Precio: " + Celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + Celda3.getProducto().getCodigo());
		} else {
			System.out.println("*********Celda B1 ");
			System.out.println("Stock: " + Celda3.getStock());
			System.out.println("La celda no tiene producto");
			

		}

		if (Celda4 != null && Celda4.getProducto() != null) {
			System.out.println("*********Celda B2 ");
			System.out.println("Stock: " + Celda4.getStock());
			System.out.println("Nombre: " + Celda4.getProducto().getNombre());
			System.out.println("Precio: " + Celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + Celda4.getProducto().getCodigo());

		} else {
			System.out.println("*********Celda B2 ");
			System.out.println("Stock: " + Celda4.getStock());
			System.out.println("La celda no tiene producto");
			
		}

		System.out.println("Saldo actual: " + Saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto();
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Producto producto = buscarProductoEnCelda(codigoCelda);
		if (producto != null) {
			return producto.getPrecio();
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (Celda1 != null && Celda1.getProducto() != null && Celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda1;
		} else if (Celda2 != null && Celda2.getProducto() != null
				&& Celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda2;
		} else if (Celda3 != null && Celda3.getProducto() != null
				&& Celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda3;
		} else if (Celda4 != null && Celda4.getProducto() != null
				&& Celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda4;
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
		}
	}

	public void vender(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			celda.setStock(celda.getStock() - 1);
			Saldo += celda.getProducto().getPrecio();
			mostrarProductos();
		}
	}

	public double venderConCambio(String codigoCelda, double dineroIngresado) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			double precioProducto = celda.getProducto().getPrecio();
			if (dineroIngresado >= precioProducto) {
				celda.setStock(celda.getStock() - 1);
				Saldo += precioProducto;
				mostrarProductos();
				return dineroIngresado - precioProducto;
			}
		}
		return 0.0;
	}

	public MaquinaDulces() {
		Saldo = 0.0;
	}
}
