package com.krakedev.entidades;

public class Nota {
		private Materia materia;
	    private double calificacion;

		public Materia getMateria() {
			return materia;
		}
		public void setMateria(Materia materia) {
			this.materia = materia;
		}
		public double getCalificacion() {
			return calificacion;
		}
		public void setCalificacion(double calificacion) {
			this.calificacion = calificacion;
		}	    
	    // Constructor
	    public Nota(Materia materia, double calificacion) {
	        this.materia = materia;
	        setCalificacion(calificacion); 
	    }
	    
	   
		public void mostrar() {
			System.out.print("Nota [materia=" + materia + ", calificacion=" + calificacion + "]"); 
		}

	    
	    
	   



	
	    
	    
}
