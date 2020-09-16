package gestionFacultad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
  private String nombre;
  private String apellidos;
  private String identificador;
  private String estadoCivil;

  public Persona(String nombre, String apellidos, String identificador, String estadoCivil) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.identificador = identificador;
    this.estadoCivil = estadoCivil;
  }

  public void imprimir(){
    System.out.printf("%s, %s, %s, %s", nombre, apellidos, identificador, estadoCivil);
  }
}
