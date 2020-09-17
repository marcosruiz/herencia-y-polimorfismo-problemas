package listinProfesores;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {
  private Calendar fechaComienzoInterinidad;

  public ProfesorInterino(Calendar fechaComienzaInterinidad) {
    super();
    fechaComienzoInterinidad = fechaComienzaInterinidad;
  }

  public ProfesorInterino(String nombre, String apellidos, int edad, Calendar fechaComienzaInterinidad) {
    super(nombre, apellidos, edad);
    fechaComienzoInterinidad = fechaComienzaInterinidad;
  }

  public Calendar getFechaComienzoInterinidad() {
    return fechaComienzoInterinidad;
  }

  public void mostrarDatos() {
    System.out.println("Datos ProfesorInterino. Comienzo interinidad: " +
        fechaComienzoInterinidad.getTime().toString());
  }
}