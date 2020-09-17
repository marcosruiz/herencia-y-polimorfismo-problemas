package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudiante extends Persona{

  private String curso;

  public Estudiante(String nombre, String apellidos, String identificador, String estadoCivil) {
    super(nombre, apellidos, identificador, estadoCivil);
  }

  @Override
  public void imprimir(){
    super.imprimir();
    System.out.println(", estudiante, " + curso);
  }
}
