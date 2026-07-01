package model;

import java.time.LocalDate;

public class CicloEscolar {
	

	    private int id;
	    private int anio;
	    private LocalDate fechaInicio;
	    private LocalDate fechaFin;
	    private boolean activo;

	    public CicloEscolar() {

	    }

	    public CicloEscolar(int id,
	                        int anio,
	                        LocalDate fechaInicio,
	                        LocalDate fechaFin,
	                        boolean activo) {

	        this.id = id;
	        this.anio = anio;
	        this.fechaInicio = fechaInicio;
	        this.fechaFin = fechaFin;
	        this.activo = activo;

	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getAnio() {
	        return anio;
	    }

	    public void setAnio(int anio) {
	        this.anio = anio;
	    }

	    public LocalDate getFechaInicio() {
	        return fechaInicio;
	    }

	    public void setFechaInicio(LocalDate fechaInicio) {
	        this.fechaInicio = fechaInicio;
	    }

	    public LocalDate getFechaFin() {
	        return fechaFin;
	    }

	    public void setFechaFin(LocalDate fechaFin) {
	        this.fechaFin = fechaFin;
	    }

	    public boolean isActivo() {
	        return activo;
	    }

	    public void setActivo(boolean activo) {
	        this.activo = activo;
	    }

	    @Override
	    public String toString() {

	        return "Ciclo Escolar " + anio;

	    

	}

}
