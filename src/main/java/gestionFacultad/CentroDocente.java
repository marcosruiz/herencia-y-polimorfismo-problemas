package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CentroDocente {

  List<Persona> personaList;
  List<Empleado> empleadoList;

  public CentroDocente() {
    personaList = new ArrayList<>();
    empleadoList = new ArrayList<>();
  }

  public void altaPersona(Persona persona) {
    personaList.add(persona);
  }

  public void altaPersona(Empleado empleado) {
    personaList.add(empleado);
    empleadoList.add(empleado);
  }

  public void bajaPersona(String dni) {
    Object[] personaListFiltered = personaList.stream().filter((x) -> x.getDni().equals(dni)).toArray();
    for (int i = 0; i < personaListFiltered.length; i++) {
      personaList.remove(personaListFiltered[i]);
    }

    Object[] empleadoListFiltered = empleadoList.stream().filter((x) -> x.getDni().equals(dni)).toArray();
    for (int i = 0; i < empleadoListFiltered.length; i++) {
      empleadoList.remove(empleadoListFiltered[i]);
    }
  }

  public void imprimir() {
    personaList.forEach((n) -> n.imprimir());
    empleadoList.forEach((n) -> n.imprimir());
  }

  public void imprimirSalario() {
    empleadoList.forEach((n) -> n.imprimirSalario());
  }

}
