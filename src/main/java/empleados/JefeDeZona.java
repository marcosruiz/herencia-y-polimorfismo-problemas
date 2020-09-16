package empleados;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class JefeDeZona extends Empleado{

  ArrayList<Vendedor> vendedorArrayList;
  Coche coche;


  public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
    super(nombre, apellidos, dni, direccion, telefono, salario);
    super.incremento = 0.20;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.print(", jefe de zona");
  }

  public void altaVendedor(Vendedor nuevoVendedor){
    vendedorArrayList.add(nuevoVendedor);
  }

  public void bajaVendedor(Vendedor vendedor){
    vendedorArrayList.remove(vendedor);
  }

  public void cambiarCoche(Coche coche){
    this.coche = coche;
  }

}
