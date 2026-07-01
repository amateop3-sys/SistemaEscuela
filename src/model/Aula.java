package model;

public class Aula {

	
	    private int id;
	    private String codigo;
	    private String nombre;
	    private int capacidad;
	    private boolean disponible;

	    public Aula() {

	    }

	    public Aula(int id,
	                String codigo,
	                String nombre,
	                int capacidad,
	                boolean disponible) {

	        this.id = id;
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.capacidad = capacidad;
	        this.disponible = disponible;

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

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getCapacidad() {
	        return capacidad;
	    }

	    public void setCapacidad(int capacidad) {
	        this.capacidad = capacidad;
	    }

	    public boolean isDisponible() {
	        return disponible;
	    }

	    public void setDisponible(boolean disponible) {
	        this.disponible = disponible;
	    }

	    @Override
	    public String toString() {

	        return codigo + " - " + nombre;

	    }

	}
	
