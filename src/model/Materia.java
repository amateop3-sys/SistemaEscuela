package model;

public class Materia {
	
	private int id;
	private String codigo;
	private String nombre;
	private String descripcion;
	private int creditos;
	private boolean activa;
	
	// constructor vacio
	public Materia() {

	}

	

	// constructor con atributos
	public Materia(int id, String codigo, String nombre, String descripcion, int creditos, boolean activa) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.creditos = creditos;
		this.activa = activa;
	}



	// getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCreditos() {
		return creditos;
	}


	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}


	public boolean isActiva() {
		return activa;
	}


	public void setActiva(boolean activa) {
		this.activa = activa;
	}



	// to string
	@Override
	public String toString() {
		return  codigo + " - " + nombre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
