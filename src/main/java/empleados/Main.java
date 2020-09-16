package empleados;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args){
    ArrayList<Empleado> empleadoArrayList = new ArrayList<>();
    int i = 0;
    empleadoArrayList.add(new Empleado("nombre" + i, "apellidos" + i, "dni" + i, "direccion" + i, "telefono" + i, 100.0));
    i++;
    empleadoArrayList.add(new JefeDeZona("nombre" + i, "apellidos" + i, "dni" + i, "direccion" + i, "telefono" + i, 100.0));
    i++;
    empleadoArrayList.add(new Vendedor("nombre" + i, "apellidos" + i, "dni" + i, "direccion" + i, "telefono" + i, 100.0));
    i++;
    empleadoArrayList.add(new Secretario("nombre" + i, "apellidos" + i, "dni" + i, "direccion" + i, "telefono" + i, 100.0));
    
    for(Empleado e : empleadoArrayList){
      e.imprimir();System.out.println();
      e.incrementarSalario();
      e.imprimir();System.out.println();
    }
  }
}
