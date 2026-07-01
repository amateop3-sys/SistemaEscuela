package service;

import java.util.ArrayList;
import java.util.List;

import interfaces.Crud;
import model.Catedratico;

public class CatedraticoService implements Crud<Catedratico> {
	

	    private ArrayList<Catedratico> catedraticos;

	    public CatedraticoService() {

	        catedraticos = new ArrayList<>();

	    }

	    @Override
	    public boolean agregar(Catedratico catedratico) {

	        if (buscar(catedratico.getCodigoEmpleado()) != null) {

	            return false;

	        }

	        catedraticos.add(catedratico);

	        return true;

	    }

	    @Override
	    public Catedratico buscar(String codigo) {

	        for (Catedratico c : catedraticos) {

	            if (c.getCodigoEmpleado().equalsIgnoreCase(codigo)) {

	                return c;

	            }

	        }

	        return null;

	    }

	    @Override
	    public boolean eliminar(String codigo) {

	        Catedratico c = buscar(codigo);

	        if (c == null) {

	            return false;

	        }

	        catedraticos.remove(c);

	        return true;

	    }

	    @Override
	    public List<Catedratico> listar() {

	        return catedraticos;

	    }

	    @Override
	    public boolean modificar(Catedratico nuevo) {

	        Catedratico actual = buscar(nuevo.getCodigoEmpleado());

	        if (actual == null) {

	            return false;

	        }

	        actual.setNombre(nuevo.getNombre());
	        actual.setApellidos(nuevo.getApellidos());
	        actual.setEdad(nuevo.getEdad());
	        actual.setTelefono(nuevo.getTelefono());
	        actual.setDireccion(nuevo.getDireccion());

	        actual.setProfesion(nuevo.getProfesion());
	        actual.setEspecialidad(nuevo.getEspecialidad());
	        actual.setSalario(nuevo.getSalario());
	        actual.setActivo(nuevo.isActivo());

	        return true;

	    }

	}


