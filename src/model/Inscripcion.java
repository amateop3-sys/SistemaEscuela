package model;

import java.time.LocalDate;

import enums.EstadoInscripcion;

public class Inscripcion {
	
	
	
	private int id;
	private LocalDate fechaInscripcion;


	private Estudiante estudiante;
	private Curso curso;
	
	private EstadoInscripcion estado;
	
	// const. vacio
	public Inscripcion() {
	
	}


	// const. lleno

	public Inscripcion(int id, LocalDate fechaInscripcion, Estudiante estudiante, Curso curso,
			EstadoInscripcion estado) {
		super();
		this.id = id;
		this.fechaInscripcion = fechaInscripcion;
		this.estudiante = estudiante;
		this.curso = curso;
		this.estado = estado;
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


	public EstadoInscripcion getEstado() {
		return estado;
	}


	public void setEstado(EstadoInscripcion estado) {
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
