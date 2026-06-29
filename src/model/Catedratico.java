package model;

public class Catedratico extends Personas {
	
	private String codigoEmpleado;
	private String profesion;
	private String especialidad;
	private double salario;
	private boolean Activo;
	
	// constructor vacio
	public Catedratico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// constructor con atributos
	public Catedratico(String codigoEmpleado, String profesion, String especialidad, double salario, boolean activo) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.profesion = profesion;
		this.especialidad = especialidad;
		this.salario = salario;
		Activo = activo;
	}


	
	// getters and setters
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}


	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public boolean isActivo() {
		return Activo;
	}


	public void setActivo(boolean activo) {
		Activo = activo;
	}

	

	// sobreescritura metodo mostrar
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		
		System.out.println("CODIGO EMPLEADO: "+codigoEmpleado);
		System.out.println("PROFESIÓN: "+profesion);
		System.out.println("ESPECIALIDAD: "+especialidad);
		System.out.println("SALARIO: "+salario);
		System.out.println("ESTADO: "+(Activo ? "ACTIVO" : "INACTIVO"));
		
	}
	
	
	
	
	
	
	
	
	
	

}
