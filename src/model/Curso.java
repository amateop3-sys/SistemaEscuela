package model;

public class Curso {
	
	
	private int id;
	private String codigo;
	
	private Materia materia;
	private Catedratico catedratico;
	private Grado grado;
	private Seccion seccion;
	private boolean activo;
	
	private CicloEscolar cicloEscolar;
	
	// constructor vacio
	public Curso() {
		
	}


	// constructor lleno
	public Curso(int id, String codigo, Materia materia, Catedratico catedratico, Grado grado, Seccion seccion,
			boolean activo, CicloEscolar cicloEscolar) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.materia = materia;
		this.catedratico = catedratico;
		this.grado = grado;
		this.seccion = seccion;
		this.activo = activo;
		this.cicloEscolar= cicloEscolar;
	}


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


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public Catedratico getCatedratico() {
		return catedratico;
	}


	public void setCatedratico(Catedratico catedratico) {
		this.catedratico = catedratico;
	}


	public Grado getGrado() {
		return grado;
	}


	public void setGrado(Grado grado) {
		this.grado = grado;
	}


	public Seccion getSeccion() {
		return seccion;
	}


	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public CicloEscolar getCicloEscolar() {
		return cicloEscolar;
	}


	public void setCicloEscolar(CicloEscolar cicloEscolar) {
		this.cicloEscolar = cicloEscolar;
	}
	
	
	
	
	
	

}
