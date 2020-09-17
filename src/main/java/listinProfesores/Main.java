package listinProfesores;

import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);
    profesor1.setIdProfesor("Prof 22-387-11");
    Calendar fecha1 = Calendar.getInstance();
    fecha1.set(2019, 10, 22); //Los meses van de 0 a 11, luego 10 representa noviembre
    ProfesorInterino interino1 = new ProfesorInterino("José Luis", "Morales Pérez", 54, fecha1);
    ListinProfesores listin1 = new ListinProfesores();
    listin1.addProfesor(profesor1);
    listin1.addProfesor(interino1);
    listin1.listar();
  }
}