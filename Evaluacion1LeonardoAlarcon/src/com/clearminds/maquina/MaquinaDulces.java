package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<>();
		saldo = 0.0;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		Celda celda1 = new Celda(codigo1);
		celdas.add(celda1);
		Celda celda2 = new Celda(codigo2);
		celdas.add(celda2);
		Celda celda3 = new Celda(codigo3);
		celdas.add(celda3);
		Celda celda4 = new Celda(codigo4);
		celdas.add(celda4);
	}

	public void mostrarConfiguracion() {
		for (Celda celda : celdas) {
			System.out.println(celda.getCodigo());
		}

	}

	public Celda buscarCelda(String codigo) {
		for (Celda celda1 : celdas) {
			if (celda1.getCodigo().equals(codigo)) {
				return celda1;
			}
		}
		for (Celda celda2 : celdas) {
			if (celda2.getCodigo().equals(codigo)) {
				return celda2;
			}
		}
		for (Celda celda3 : celdas) {
			if (celda3.getCodigo().equals(codigo)) {
				return celda3;
			}
		}
		for (Celda celda4 : celdas) {
			if (celda4.getCodigo().equals(codigo)) {
				return celda4;
			}
		}
		return null;

	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			celda.ingresarProducto(producto, cantidad);
		}
	}

	public void mostrarProductos() {
		for (Celda celda1 : celdas) {
			if (celda1 != null && celda1.getProducto() != null) {
				System.out.println("*********Celda A1 ");
				System.out.println("Código de celda: " + celda1.getCodigo());
				System.out.println("Stock actual: " + celda1.getStock());
				System.out.println("Nombre del producto: " + celda1.getProducto().getNombre());
				System.out.println("Precio del producto: " + celda1.getProducto().getPrecio());
			} else {
				System.out.println("*********Celda A1 ");
				System.out.println("Stock: " + celda1.getStock());
				System.out.println("La celda no tiene producto");
			}
		}
		for (Celda celda2 : celdas) {
			if (celda2 != null && celda2.getProducto() != null) {
				System.out.println("*********Celda A2 ");
				System.out.println("Código de celda: " + celda2.getCodigo());
				System.out.println("Stock actual: " + celda2.getStock());
				System.out.println("Nombre del producto: " + celda2.getProducto().getNombre());
				System.out.println("Precio del producto: " + celda2.getProducto().getPrecio());
			} else {
				System.out.println("*********Celda A2 ");
				System.out.println("Stock: " + celda2.getStock());
				System.out.println("La celda no tiene producto");

			}
		}
		for (Celda celda3 : celdas) {
			if (celda3 != null && celda3.getProducto() != null) {

				System.out.println("*********Celda A3 ");
				System.out.println("Código de celda: " + celda3.getCodigo());
				System.out.println("Stock actual: " + celda3.getStock());
				System.out.println("Nombre del producto: " + celda3.getProducto().getNombre());
				System.out.println("Precio del producto: " + celda3.getProducto().getPrecio());
			} else {
				System.out.println("*********Celda B1 ");
				System.out.println("Stock: " + celda3.getStock());
				System.out.println("La celda no tiene producto");

			}
		}
		for (Celda celda4 : celdas) {
			if (celda4 != null && celda4.getProducto() != null) {

				System.out.println("*********Celda A4 ");
				System.out.println("Código de celda: " + celda4.getCodigo());
				System.out.println("Stock actual: " + celda4.getStock());
				System.out.println("Nombre del producto: " + celda4.getProducto().getNombre());
				System.out.println("Precio del producto: " + celda4.getProducto().getPrecio());
			} else {
				System.out.println("*********Celda B2 ");
				System.out.println("Stock: " + celda4.getStock());
				System.out.println("La celda no tiene producto");

			}
		}

		System.out.println("Saldo actual: " + saldo);

	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto();
		}
		return null;

	}

	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto().getPrecio();
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
        for (Celda celda1 : celdas) {
        	if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
    			return celda1;
            }
        }
        	for (Celda celda2 : celdas) {
            	if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
        			return celda2;
                }
        	}
            	for (Celda celda3 : celdas) {
                	if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
            			return celda3;
                    }
            	}
                	for (Celda celda4 : celdas) {
                    	if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
                			return celda4;
             
        }
                	}
                	
        return null;
    }
           

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celda = buscarCeldaProducto(codigoProducto);
		if (celda != null) {
			celda.setStock(celda.getStock() + cantidad);
		}
	}

	public void vender(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			celda.setStock(celda.getStock() - 1);
			saldo += celda.getProducto().getPrecio();
			mostrarProductos();
		}
	}

	public double venderConCambio(String codigoCelda, double dineroIngresado) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			double precioProducto = celda.getProducto().getPrecio();
			if (dineroIngresado >= precioProducto) {
				celda.setStock(celda.getStock() - 1);
				saldo += precioProducto;
				mostrarProductos();
				return dineroIngresado - precioProducto;

			}
			return 0.0;
		}
		return dineroIngresado;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productosMenores = new ArrayList<>();
		for (Celda celda : celdas) {
			if (celda.getProducto().getPrecio() <= limite) {
				productosMenores.add(celda.getProducto());
			}
		}
		return productosMenores;
	}

}
