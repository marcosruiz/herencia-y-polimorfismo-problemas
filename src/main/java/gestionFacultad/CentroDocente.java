package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CentroDocente {

  List<Estudiante> estudianteList;
  List<Profesor> profesorList;
  List<PersonalDeServicio> personalDeServicioList;

  public CentroDocente() {
    estudianteList = new ArrayList<>();
    profesorList = new ArrayList<>();
    personalDeServicioList = new ArrayList<>();
  }

  public void altaPersona(Estudiante estudiante) {
    estudianteList.add(estudiante);
  }

  public void altaPersona(Profesor profesor) {
    profesorList.add(profesor);
  }

  public void altaPersona(PersonalDeServicio personalDeServicio) {
    personalDeServicioList.add(personalDeServicio);
  }

  public void bajaPersona(String dni) {
    Object[] estudianteListFiltered = estudianteList.stream().filter((x) -> x.getDni().equals(dni)).toArray();
    for (int i = 0; i < estudianteListFiltered.length; i++) {
      personalDeServicioList.remove(estudianteListFiltered[i]);
    }

    Object[] profesorListFiltered = profesorList.stream().filter((x) -> x.getDni().equals(dni)).toArray();
    for (int i = 0; i < profesorListFiltered.length; i++) {
      personalDeServicioList.remove(profesorListFiltered[i]);
    }

    Object[] pdsListFiltered = personalDeServicioList.stream().filter((x) -> x.getDni().equals(dni)).toArray();
    for (int i = 0; i < pdsListFiltered.length; i++) {
      personalDeServicioList.remove(pdsListFiltered[i]);
    }
  }

  public void imprimir() {
    estudianteList.forEach((n) -> n.imprimir());
    profesorList.forEach((n) -> n.imprimir());
    personalDeServicioList.forEach((n) -> n.imprimir());
  }

  public void imprimirSalario() {
    profesorList.forEach((n) -> n.imprimirSalario());
    personalDeServicioList.forEach((n) -> n.imprimirSalario());
  }

}
