package model;

import java.util.ArrayList;

public class Estudiante extends Personas {
	
	
	private String carnet;
	private String grado;
	private String seccion;
	private boolean activo;
	
	private ArrayList<Inscripcion> inscripciones;
	
	// constructor vacio
	public Estudiante() {
	
	}

	

	// constructor con atributos


	public Estudiante(String carnet, String grado, String seccion, boolean activo,
			ArrayList<Inscripcion> inscripciones) {
		super();
		this.carnet = carnet;
		this.grado = grado;
		this.seccion = seccion;
		this.activo = activo;
		inscripciones = new ArrayList<>();
	}




	// getters and setters
	


	public String getCarnet() {
		return carnet;
	}



	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}



	public String getGrado() {
		return grado;
	}



	public void setGrado(String grado) {
		this.grado = grado;
	}



	public String getSeccion() {
		return seccion;
	}



	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}



	public boolean isActivo() {
		return activo;
	}



	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	public ArrayList<Inscripcion> getInscripciones() {
		return inscripciones;
	}



	public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
		this.inscripciones = inscripciones;
	}
	
	

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		
		System.out.println("CÁRNET: "+carnet);
		System.out.println("GRADO: "+grado);
		System.out.println("SECCIÓN: "+seccion);
		System.out.println("ACTIVO: "+(activo ? "ACTIVO" : "INACTIVO"));
	}

	
	
	public void agregarInscripcion(Inscripcion inscripcion){

	    inscripciones.add(inscripcion);

	}
	
	
	
	
	
	
	
	

}
