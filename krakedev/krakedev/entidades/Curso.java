package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	 private ArrayList<Estudiante> estudiantes;
	 
	
	   
	 
	 
	 
	 
	 
	   
	 public Curso() {
		super();
		estudiantes=new ArrayList<>();
	}




	public void matricularEstudiante(Estudiante e) {
		
	
		if (buscarEstudiantePorCedula(e.getCedula())==null) {
			 
			    estudiantes.add(e);
		}
		
		
		
		/*
		    for (Estudiante estudiante : estudiantes) {
		        if (estudiante.getCedula().equals(e.getCedula())) {
		            System.out.println("Ya existe un estudiante con la cédula " + e.getCedula());
		            return;}
		    }
		    System.out.println(e.toString()); 
		    estudiantes.add(e);*/
		}




	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	 public double calcularPromedioCurso() {
	        if (estudiantes.isEmpty()) {
	            return 0.0; 
	        }

	        double sumaPromedios = 0.0;
	        for (Estudiante estudiante : estudiantes) {
	 
	        	
	            sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
	        }

	        return sumaPromedios / estudiantes.size();
	    }


	    public Estudiante buscarEstudiantePorCedula(String cedula) {
	        for (Estudiante estudiante : estudiantes) {
	            if (estudiante.getCedula().equals(cedula)) {
	            	   System.out.println("Ya existe un estudiante con la cédula " + estudiante.getCedula());
	                return estudiante; // Devolver el estudiante si se encuentra
	            }
	        }
	        
	        return null; // Devolver null si no se encuentra ningún estudiante con el código especificado
	    }


	    public void mostrar() {
	        System.out.println("Lista de Estudiantes:");
	        for (Estudiante estudiante : estudiantes) {
	        	estudiante.mostrar();
	        }
	    }





		
	    

}



