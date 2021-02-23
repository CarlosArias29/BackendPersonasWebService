package org.software.data;

import java.util.List;
import org.software.domain.Persona;

public interface PersonaDao {

    public List<Persona> encontrarTodasPersonas();

    public Persona encontrarPersona(Persona persona);

    public void insertarPersona(Persona persona);

    public void actualizarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}
