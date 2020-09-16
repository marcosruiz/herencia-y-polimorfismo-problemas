package pruebaHerencia;

public class Student extends Person{
  public Student(){
    super();
  }

  public void doSomethingPublicAndProtected(){
    doSomethingPublic();
    doSomethingProtected();
  }
}
