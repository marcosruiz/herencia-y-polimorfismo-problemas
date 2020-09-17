package gestionFacultad;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    punto1();
    System.out.println();
    punto2();
    System.out.println();
    punto4();

  }

  public static void punto1() {
    ArrayList<Persona> personas = getPersonaListFilled();
    for (Persona p : personas) {
      p.imprimir();
    }
  }

  public static void punto2() {
    CentroDocente centroDocente = getCentroDocenteFilled();
    centroDocente.imprimir();
  }

  public static void punto4() {
    CentroDocente centroDocente = getCentroDocenteFilled();
    centroDocente.imprimirSalario();
  }


  private static CentroDocente getCentroDocenteFilled() {
    ArrayList<Persona> personas = getPersonaListFilled();
    CentroDocente centroDocente = new CentroDocente();
    for (Persona p : personas) {
      if (p.getClass().equals(PersonalDeServicio.class)) {
        centroDocente.altaPersona((PersonalDeServicio) p);
      } else if (p.getClass().equals(Profesor.class)) {
        centroDocente.altaPersona((Profesor) p);
      } else if (p.getClass().equals(Estudiante.class)) {
        centroDocente.altaPersona((Estudiante) p);
      }
    }
    return centroDocente;
  }


  private static ArrayList<Persona> getPersonaListFilled() {
    ArrayList<Persona> personas = new ArrayList<>();
    int i = 0;
    for (int j = 0; j < 5; j++) {
      Estudiante estudiante = new Estudiante("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
      estudiante.setCurso("curso" + i);
      personas.add(estudiante);
      i++;
    }
    for (int j = 0; j < 5; j++) {
      Profesor profesor = new Profesor("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
      profesor.setDepartamento("departamento" + i);
      profesor.setAnoDeIncorporacion(i);
      profesor.setNumDespacho(i);
      profesor.setSueldoBase(100.00);
      personas.add(profesor);
      i++;
    }
    for (int j = 0; j < 5; j++) {
      PersonalDeServicio pds = new PersonalDeServicio("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
      pds.setAnoDeIncorporacion(i);
      pds.setNumDespacho(i);
      pds.setSeccion("seccion" + i);
      pds.setSueldoBase(100.00);
      personas.add(pds);
      i++;
    }
    return personas;
  }
}
