package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CentroDocente {

  List<Persona> personaList;

  public CentroDocente() {
    personaList = new ArrayList<>();
  }

  public void altaPersona(Persona persona) {
    personaList.add(persona);
  }

  public void bajaPersona(String dni) {
    personaList.stream().filter((x) -> x.getDni().equals(dni)).forEach((x) -> personaList.remove(x));
  }

  public void imprimir() {
    personaList.forEach((n) -> n.imprimir());
  }

}
