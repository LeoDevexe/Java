package com.krakedev.entidades;

import java.util.ArrayList;


public class Estudiante {
	 private String cedula;
	    private String nombre;
	    private String apellido;
	    private ArrayList<Nota> notas;

	   


	    
	    public Estudiante(String cedula, String nombre, String apellido) {
	        this.cedula = cedula;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.notas=new ArrayList<>();
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

		public ArrayList<Nota> getNotas() {
			return notas;
		}

		public void setNotas(ArrayList<Nota> notas) {
			this.notas = notas;
		}

	
		  public void mostrar() {
		       System.out.print( "Estudiante [cedula=" + cedula +
		                ", nombre=" + nombre +
		                ", apellido=" + apellido +
		                ", notas=");
		        for (Nota nota : notas) {
		         nota.mostrar();
		        }

		     System.out.print( "]");
		    }
	    
		
		
		
		public void modificarNota(String codigo, double nuevaNota) {
	        for (Nota nota : notas) {
	            if (nota.getMateria().getCodigo().equals(codigo)) {
	                // Validar que el nuevo valor esté en el rango 0-10
	                if (nuevaNota >= 0.0 && nuevaNota <= 10.0) {
	                    nota.setCalificacion(nuevaNota);
	                    System.out.println("Calificación de la nota con código " + codigo + " actualizada correctamente.");
	                } else {
	                    System.out.println("Error: La nueva nota debe ser mayor o igual a 0 y menor o igual a 10.");
	                }
	                return;
	            }
	        }
	        System.out.println("No se encontró una nota con el código " + codigo + ".");
	    }
		
		
		
		
	    public void agregarNota(Nota nuevaNota) {
	    	
	        // Validar que la calificación sea mayor a 0 y menor a 10
	        if (nuevaNota.getCalificacion() >= 0.0 && nuevaNota.getCalificacion() <= 10.0) {
	            // Verificar si ya existe una nota con el mismo código
	            for (Nota notaExistente : notas) {
	            
	                if (notaExistente.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
	                    System.out.println("Ya existe una nota con el código " + nuevaNota.getMateria().getCodigo() + ".");
	                    return;
	                }
	            }
	            //Si no existe, añadir la nueva nota
	       
	            notas.add(nuevaNota);
	            System.out.println("Nueva nota añadida correctamente.");
	        } else {
	            System.out.println("Error: La nueva nota debe ser mayor o igual a 0 y menor o igual a 10.");
	        }
	    }
	    public double calcularPromedioNotasEstudiante() {
	        if (notas.isEmpty()) {
	            return 0.0; 
	        }

	        double sumaNotas = 0.0;
	        for (Nota nota : notas) {
	            sumaNotas += nota.getCalificacion();
	        }

	        return sumaNotas / notas.size();
	    }
	    
	    
	
		
		
}
