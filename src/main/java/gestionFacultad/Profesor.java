package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profesor extends Empleado{

  private String departamento;

  public Profesor(String nombre, String apellidos, String identificador, String estadoCivil) {
    super(nombre, apellidos, identificador, estadoCivil);
  }

  @Override
  public void imprimir(){
    super.imprimir();
    System.out.print(", profesor, " + departamento);
  }
}
