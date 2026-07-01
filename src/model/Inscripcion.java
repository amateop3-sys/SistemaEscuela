package model;

import java.time.LocalDate;

public class Inscripcion {
	
	
	
	private int id;
	private LocalDate fechaInscripcion;
	private String estado;

	private Estudiante estudiante;
	private Curso curso;
	
	
	// const. vacio
	public Inscripcion() {
	
	}


	// const. lleno
	public Inscripcion(int id, LocalDate fechaInscripcion, String estado, Estudiante estudiante, Curso curso) {
		super();
		this.id = id;
		this.fechaInscripcion = fechaInscripcion;
		this.estado = estado;
		this.estudiante = estudiante;
		this.curso = curso;
	}


	// getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}


	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
		

}
