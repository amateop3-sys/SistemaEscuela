package model;

public class Seccion {

	private int id;
	private String nombre;
	
	// cons. vacio
	public Seccion() {
		
	}

	// cons. lleno
	public Seccion(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	// gettes and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
