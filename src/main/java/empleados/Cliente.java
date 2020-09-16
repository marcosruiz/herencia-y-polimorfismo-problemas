package empleados;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
  String nombre;
  String apellidos;

  public Cliente(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }
}
