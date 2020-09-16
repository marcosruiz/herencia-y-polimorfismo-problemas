package gestionFacultad;

import pruebaHerencia.Person;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    ArrayList<Persona> personas = new ArrayList<>();
    int i = 0;
    Persona persona = new Persona("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
    personas.add(persona);
    i++;
    Empleado empleado = new Empleado("nombre" + i, "apellidos" + i, "id" + i, "estadoCivil" + i);
    empleado.setAnoDeIncorporacion(i);
    empleado.setNumDespacho(i);
    personas.add(empleado);
    i++;
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

    for(Persona p: personas){
      p.imprimir();
      System.out.println();
    }
  }
}
