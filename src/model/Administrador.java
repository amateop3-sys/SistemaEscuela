package model;

public class Administrador extends Personas{
	
	
	private String codigoEmpleado;
	private String usuario;
	private String password;
	private String rol;
	private boolean Activo;
	
	// constructor vacio
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// constructor con atributos
	public Administrador(String nombre, String apellidos, String dpi, String telefono, String direccion, int edad,
			String genero) {
		super(nombre, apellidos, dpi, telefono, direccion, edad, genero);
		// TODO Auto-generated constructor stub
	}

	
	// getters and setters
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isActivo() {
		return Activo;
	}

	public void setActivo(boolean activo) {
		Activo = activo;
	}

	
	// sobreescritura metodo
	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		
		System.out.println("CODIGO EMPLEADO: "+codigoEmpleado);
		System.out.println("USUARIO: "+usuario);
		System.out.println("CONTRASEÑA: "+password);
		System.out.println("ROL: "+rol);
		System.out.println("ESTADO: "+(Activo ? "ACTIVO" : "INACTIVO"));
		
	}
	
	
	
	
	
	
	

}
