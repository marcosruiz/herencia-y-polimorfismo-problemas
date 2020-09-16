package empleados;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Secretario extends Empleado {
  private String despacho;
  private String fax;
  private double incremento = 0.05;

  public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
    super(nombre, apellidos, dni, direccion, telefono, salario);
    super.incremento = 0.05;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.print(", secretario");
  }
}
