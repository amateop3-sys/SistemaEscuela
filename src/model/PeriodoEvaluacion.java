package model;

public class PeriodoEvaluacion {


	    private int id;
	    private String nombre;
	    private double porcentaje;

	    public PeriodoEvaluacion() {
	    }

	    public PeriodoEvaluacion(int id, String nombre, double porcentaje) {
	        this.id = id;
	        this.nombre = nombre;
	        this.porcentaje = porcentaje;
	    }

	    // Getters y Setters
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

		public double getPorcentaje() {
			return porcentaje;
		}

		public void setPorcentaje(double porcentaje) {
			this.porcentaje = porcentaje;
		}

	   
	
}
