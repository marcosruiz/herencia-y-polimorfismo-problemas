package empleados;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Vendedor extends Empleado{

  Coche coche;
  String movil;
  String areaDeVenta;
  ArrayList<Cliente> clienteArrayList;
  Double comision;

  public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
    super(nombre, apellidos, dni, direccion, telefono, salario);
    super.incremento = 0.10;
  }

  public void altaCliente(Cliente nuevoCliente){
    clienteArrayList.add(nuevoCliente);
  }

  public void bajaCliente(Cliente cliente){
    clienteArrayList.remove(cliente);
  }

  public void cambiarCoche(Coche coche){
    this.coche = coche;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.print(", vendedor");
  }
}
