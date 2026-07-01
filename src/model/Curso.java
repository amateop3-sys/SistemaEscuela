package model;

import java.util.ArrayList;

import enums.EstadoCurso;

public class Curso {
	
	
	private int id;
	private String codigo;
	
	private Materia materia;
	private Catedratico catedratico;
	private Grado grado;
	private Seccion seccion;

	private EstadoCurso estado;
	
	private CicloEscolar cicloEscolar;
	
	private ArrayList<Horario> horarios;
	
	// constructor vacio
	public Curso() {
		
	}


	// constructor lleno
	public Curso(int id, String codigo, Materia materia, Catedratico catedratico, Grado grado, Seccion seccion,
			EstadoCurso estado, CicloEscolar cicloEscolar, ArrayList<Horario> horarios) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.materia = materia;
		this.catedratico = catedratico;
		this.grado = grado;
		this.seccion = seccion;
		this.estado = estado;
		this.cicloEscolar = cicloEscolar;
		this.setHorarios(horarios);
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


	public EstadoCurso getEstado() {
		return estado;
	}


	public void setEstado(EstadoCurso estado) {
		this.estado = estado;
	}


	public CicloEscolar getCicloEscolar() {
		return cicloEscolar;
	}


	public void setCicloEscolar(CicloEscolar cicloEscolar) {
		this.cicloEscolar = cicloEscolar;
	}


	public ArrayList<Horario> getHorarios() {
		return horarios;
	}


	public void setHorarios(ArrayList<Horario> horarios) {
		this.horarios = horarios;
	}



	
	
	

}
