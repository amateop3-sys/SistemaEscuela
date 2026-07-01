package model;


import java.time.LocalDate;

public class Asistencia {

	    private int id;
	    private LocalDate fecha;
	    private boolean presente;
	    private String observacion;

	    private Estudiante estudiante;
	    private Curso curso;

	    // constructor vacio
	    public Asistencia() {
	    }

	    // constructor lleno
		public Asistencia(int id, LocalDate fecha, boolean presente, String observacion, Estudiante estudiante,
				Curso curso) {
			super();
			this.id = id;
			this.fecha = fecha;
			this.presente = presente;
			this.observacion = observacion;
			this.estudiante = estudiante;
			this.curso = curso;
		}

		
		 // Getters y Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public boolean isPresente() {
			return presente;
		}

		public void setPresente(boolean presente) {
			this.presente = presente;
		}

		public String getObservacion() {
			return observacion;
		}

		public void setObservacion(String observacion) {
			this.observacion = observacion;
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
