package empleados;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado {
  private String nombre;
  private String apellidos;
  private String dni;
  private String direccion;
  private int anosDeAntiguedad;
  private String telefono;
  private double salario;
  private Empleado supervisor;
  protected double incremento;

  public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.direccion = direccion;
    this.telefono = telefono;
    this.salario = salario;
    anosDeAntiguedad = 0;
    incremento = 0.0;
  }

  public void imprimir() {
    String out = nombre + ", " + apellidos + ", " + dni + ", " + direccion + ", " + anosDeAntiguedad + ", " + telefono + ", " + salario + ", " + supervisor;
    System.out.print(out);
  }

  public void cambiarSupervisor(Empleado nuevoSupervisor) {
    supervisor = nuevoSupervisor;
  }

  public void incrementarSalario() {
    salario = salario + salario * incremento;
    anosDeAntiguedad += 1;
  }

}
