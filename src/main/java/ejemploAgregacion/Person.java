package ejemploAgregacion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
  private String nombre;
  private String dni;

  public Person(String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
  }

  @Override
  public String toString() {
    return "Persona{" +
        "nombre='" + nombre + '\'' +
        ", dni='" + dni + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    return dni.equals(((Person) obj).dni);
  }

}
