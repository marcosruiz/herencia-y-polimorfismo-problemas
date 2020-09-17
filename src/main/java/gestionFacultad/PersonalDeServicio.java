package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalDeServicio extends Empleado {
  private String seccion;

  public PersonalDeServicio(String nombre, String apellidos, String identificador, String estadoCivil) {
    super(nombre, apellidos, identificador, estadoCivil);
  }

  @Override
  public String getPuesto() {
    return "personal de servicio";
  }
}
