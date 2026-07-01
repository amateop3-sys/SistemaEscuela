package main;

import model.Estudiante;
import service.EstudianteService;

public class Main {

	public static void main(String[] args) {
	

		        EstudianteService servicio = new EstudianteService();

		        Estudiante estudiante1 = new Estudiante();

		        estudiante1.setNombre("Carlos");
		        estudiante1.setApellidos("López");
		        estudiante1.setCarnet("2026001");

		        if (servicio.agregar(estudiante1)) {

		            System.out.println("Estudiante agregado.");

		        } else {

		            System.out.println("No se pudo agregar.");

		        }

		        Estudiante encontrado = servicio.buscar("2026001");

		        if (encontrado != null) {

		            System.out.println();
		            System.out.println("=== ESTUDIANTE ENCONTRADO ===");

		            encontrado.mostrarInformacion();

		        }


		}
		

	}

