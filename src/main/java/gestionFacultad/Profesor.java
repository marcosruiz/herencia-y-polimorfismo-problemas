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
  public String getPuesto() {
    return "profesor";
  }

  @Override
  public double getSueldo() {
    if(getAnoDeIncorporacion()<2000){
      return getSueldoBase() + getSueldoBase() * 0.08;
    } else {
      return getSueldoBase();
    }
  }
}
