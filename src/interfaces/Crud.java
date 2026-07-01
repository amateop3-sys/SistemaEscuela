package interfaces;

import java.util.List;
public interface Crud<T> {
	
	

    boolean agregar(T objeto);

    boolean eliminar(String id);

    T buscar(String id);

    List<T> listar();

    boolean modificar(T objeto);
	
	
	
	

}
