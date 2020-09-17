package listinProfesores;

public class Profesor extends Persona { //Ejemplo aprenderaprogramar.com
  private String idProfesor;

  public Profesor() {
    super();
    idProfesor = "Unknown";
  }

  public Profesor(String nombre, String apellidos, int edad) {
    super(nombre, apellidos, edad);
    idProfesor = "Unknown";
  }

  public void setIdProfesor(String IdProfesor) {
    this.idProfesor = IdProfesor;
  }

  public String getIdProfesor() {
    return idProfesor;
  }

  public void mostrarDatos() {
    System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellidos() +
        " con Id de profesor: " + getIdProfesor());
  }
}