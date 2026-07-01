package model;

public class Calificacion {


	    private int id;

	    private double nota;

	    private Estudiante estudiante;
	    private Curso curso;
	    private PeriodoEvaluacion periodoEvaluacion;

	    public Calificacion() {
	    }

	    public Calificacion(int id,
	                         double nota,
	                         Estudiante estudiante,
	                         Curso curso,
	                         PeriodoEvaluacion periodoEvaluacion) {

	        this.id = id;
	        this.nota = nota;
	        this.estudiante = estudiante;
	        this.curso = curso;
	        this.periodoEvaluacion = periodoEvaluacion;

	    }

	

	    // Getters y Setters

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getNota() {
			return nota;
		}

		public void setNota(double nota) {
			this.nota = nota;
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

		public PeriodoEvaluacion getPeriodoEvaluacion() {
			return periodoEvaluacion;
		}

		public void setPeriodoEvaluacion(PeriodoEvaluacion periodoEvaluacion) {
			this.periodoEvaluacion = periodoEvaluacion;
		}
	
}
