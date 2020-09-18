package empleados;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmpleadoTest {

  @Test
  public void salarioEmpleado(){
    Empleado empleado = new Empleado("nombre", "apellidos", "dni", "direccion", "telefono", 100.0);
    empleado.incrementarSalario();
    assertEquals(100.00, empleado.getSalario(), 0.01);
  }

  @Test
  public void salarioSecretario(){
    Secretario secretario = new Secretario("nombre", "apellidos", "dni", "direccion", "telefono", 100.0);
    secretario.incrementarSalario();
    assertEquals(105.00, secretario.getSalario(), 0.01);
  }

  @Test
  public void salarioVendedor(){
    Vendedor vendedor = new Vendedor("nombre", "apellidos", "dni", "direccion", "telefono", 100.0);
    vendedor.incrementarSalario();
    assertEquals(110.00, vendedor.getSalario(), 0.01);
  }

  @Test
  public void salarioJefeDeZona(){
    JefeDeZona jefeDeZona = new JefeDeZona("nombre", "apellidos", "dni", "direccion", "telefono", 100.0);
    jefeDeZona.incrementarSalario();
    assertEquals(120.00, jefeDeZona.getSalario(), 0.01);
  }

}
