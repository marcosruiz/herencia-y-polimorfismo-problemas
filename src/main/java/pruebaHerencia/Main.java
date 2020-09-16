package pruebaHerencia;

public class Main {

  public static void main(){
    Person person = new Person();
    person.doSomethingPublic();
    person.doSomethingProtected();

    Student student = new Student();
    student.doSomethingPublic();
    student.doSomethingProtected();

  }

}
