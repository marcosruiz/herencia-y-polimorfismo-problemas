package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado extends Persona {
  private int anoDeIncorporacion;
  private int numDespacho;

  public Empleado(String nombre, String apellidos, String identificador, String estadoCivil) {
    super(nombre, apellidos, identificador, estadoCivil);
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.print(", empleado, " + anoDeIncorporacion + ", " + numDespacho);
  }
}
