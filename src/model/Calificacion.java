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

	
	
}
