package service;

import java.util.ArrayList;
import java.util.List;

import interfaces.Crud;
import model.Estudiante;

public class EstudianteService implements Crud<Estudiante> {

	private ArrayList<Estudiante> estudiantes;

	public EstudianteService() {
		estudiantes = new ArrayList<>();
	}

	@Override
	public boolean agregar(Estudiante estudiante) {

		if (estudiante == null) {
			return false;
		}

		if (buscar(estudiante.getCarnet()) != null) {
			return false;
		}

		estudiantes.add(estudiante);
		return true;
	}

	@Override
	public Estudiante buscar(String carnet) {

		for (Estudiante estudiante : estudiantes) {

			if (estudiante.getCarnet().equalsIgnoreCase(carnet)) {
				return estudiante;
			}

		}

		return null;
	}

	@Override
	public boolean eliminar(String carnet) {

		Estudiante estudiante = buscar(carnet);

		if (estudiante == null) {
			return false;
		}

		estudiantes.remove(estudiante);

		return true;

	}

	@Override
	public List<Estudiante> listar() {
		return estudiantes;
	}

	@Override
	public boolean modificar(Estudiante estudianteNuevo) {

		Estudiante estudiante = buscar(estudianteNuevo.getCarnet());

		if (estudiante == null) {
			return false;
		}

		estudiante.setNombre(estudianteNuevo.getNombre());
		estudiante.setApellidos(estudianteNuevo.getApellidos());
		estudiante.setEdad(estudianteNuevo.getEdad());
		estudiante.setTelefono(estudianteNuevo.getTelefono());
		estudiante.setDireccion(estudianteNuevo.getDireccion());
		estudiante.setGrado(estudianteNuevo.getGrado());
		estudiante.setSeccion(estudianteNuevo.getSeccion());
		estudiante.setActivo(estudianteNuevo.isActivo());

		return true;

	}

}
