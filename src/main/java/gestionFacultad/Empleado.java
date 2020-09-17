package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Empleado extends Persona {
  private int anoDeIncorporacion;
  private int numDespacho;

  public Empleado(String nombre, String apellidos, String identificador, String estadoCivil) {
    super(nombre, apellidos, identificador, estadoCivil);
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println(", " + getPuesto() + ", " + anoDeIncorporacion + ", " + numDespacho);
  }

  public abstract String getPuesto();
}
