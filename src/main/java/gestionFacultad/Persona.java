package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Persona {
  private String nombre;
  private String apellidos;
  private String dni;
  private String estadoCivil;

  public Persona(String nombre, String apellidos, String dni, String estadoCivil) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.estadoCivil = estadoCivil;
  }

  public void imprimir(){
    System.out.printf("%s, %s, %s, %s", nombre, apellidos, dni, estadoCivil);
  }
}
