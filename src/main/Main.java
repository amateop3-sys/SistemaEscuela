package main;

import model.*;
public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("ESTUDIANTE");
		Estudiante estudiante= new Estudiante();
		
		estudiante.setNombre("abdiel");
		estudiante.setApellidos("mateo");
		estudiante.setDpi("45212542542");
		estudiante.setTelefono("30747318");
		estudiante.setDireccion("jutiapa");
		estudiante.setEdad(19);
		estudiante.setGenero("Masculino");
		
		estudiante.setCarnet("7854vs");
		estudiante.setGrado("universidad");
		estudiante.setSeccion("A");
		estudiante.setActivo(true);
		
		
		estudiante.mostrarInformacion();
		
		
		//----------------------------------------
		System.out.println();
		
		System.out.println("CATEDRATICO");
		Catedratico catedratico= new Catedratico();
		
		catedratico.setNombre("walter");
		catedratico.setApellidos("Cordova");
		catedratico.setDpi("4521542545");
		catedratico.setTelefono("2541635241");
		catedratico.setDireccion("el progreso");
		catedratico.setEdad(25);
		catedratico.setGenero("Masculino");
		
		catedratico.setCodigoEmpleado("5545zk4");
		catedratico.setProfesion("desarrollador de sofware");
		catedratico.setEspecialidad("Sofware");
		catedratico.setSalario(150000);
		catedratico.setActivo(true);
		
		catedratico.mostrarInformacion();
		
		
		
		// ----------------------------------------
		System.out.println();

		System.out.println("ADMINISTRADOR");
		Administrador administrador= new Administrador();
		
		administrador.setNombre("Pedro");
		administrador.setApellidos("Gonzales");
		administrador.setDpi("4525415263");
		administrador.setTelefono("452541563");
		administrador.setDireccion("jutiapa");
		administrador.setEdad(30);
		administrador.setGenero("Masculino");
		
		administrador.setCodigoEmpleado("455bsy52");
		administrador.setUsuario("admin");
		administrador.setPassword("45254sd");
		administrador.setRol("administrador escuela");
		administrador.setActivo(true);
		
		administrador.mostrarInformacion();
		
		
		
		
		
		
		
		
		

	}

}
