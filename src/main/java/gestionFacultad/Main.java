package gestionFacultad;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    punto1();
    System.out.println();
    punto2();

  }

  public static void punto1(){
    ArrayList<Persona> personas = getPersonas();
    for(Persona p: personas){
      p.imprimir();
    }
  }

  public static void punto2(){
    ArrayList<Persona> personas = getPersonas();
    CentroDocente centroDocente = new CentroDocente();
    for(Persona p: personas){
      if(p.getClass().equals(PersonalDeServicio.class)){
        centroDocente.altaPersona((PersonalDeServicio) p);
      } else if(p.getClass().equals(Profesor.class)){
        centroDocente.altaPersona((Profesor) p);
      } else if(p.getClass().equals(Estudiante.class)){
        centroDocente.altaPersona((Estudiante) p);
      }
    }
    centroDocente.imprimir();
  }

  private static ArrayList<Persona> getPersonas() {
    ArrayList<Persona> personas = new ArrayList<>();
    int i = 0;
    Estudiante estudiante = new Estudiante("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
    estudiante.setCurso("curso" + i);
    personas.add(estudiante);
    i++;
    Profesor profesor = new Profesor("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
    profesor.setDepartamento("departamento" + i);
    profesor.setAnoDeIncorporacion(i);
    profesor.setNumDespacho(i);
    personas.add(profesor);
    i++;
    PersonalDeServicio pds = new PersonalDeServicio("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
    pds.setAnoDeIncorporacion(i);
    pds.setNumDespacho(i);
    pds.setSeccion("seccion" + i);
    personas.add(pds);
    i++;
    return personas;
  }
}
