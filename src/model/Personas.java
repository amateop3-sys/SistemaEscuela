package model;

import enums.Genero;

public class Personas {
	

	
	private String nombre;
	private String apellidos;
	private String dpi;
	private String telefono;
	private String direccion;
	private int edad;

	private Genero genero;
	
	// constructor vacio
	public Personas() {
		
	}
	
	
	// constructor lleno
	public Personas(String nombre, String apellidos, String dpi, String telefono, String direccion, int edad,
			Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dpi = dpi;
		this.telefono = telefono;
		this.direccion = direccion;
		this.edad = edad;
		this.genero = genero;
	}

	

	// getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDpi() {
		return dpi;
	}


	public void setDpi(String dpi) {
		this.dpi = dpi;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
	// metodo mostrar informacion
	public void mostrarInformacion() {
		
		System.out.println("Nombre:"+nombre);		
		System.out.println("Apellidos:"+apellidos);
		System.out.println("DPI:"+dpi);
		System.out.println("Telefono:"+telefono);
		System.out.println("Direccion:"+direccion);
		System.out.println("Edad:"+edad);
		System.out.println("Genero:"+genero);
		
	}
	
	
}
