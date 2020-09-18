package ejemploAgregacion;

import java.util.ArrayList;
import java.util.List;

public class PersonGroup {
  public enum GroupType {MASCULINO, FEMENINO, MIXTO}
  List<Person> personList;
  GroupType groupType;

  public PersonGroup(GroupType groupType){
    this.personList = new ArrayList<>();
    this.groupType = groupType;
  }


  public boolean addPerson(Person p) {
    if (personList.contains(p)) { // la persona ya está en el grupo
      return false;
    }
    personList.add(p);
    return true;
  }

  public boolean eliminaPersona(Person p) {
    return personList.remove(p);
  }

  public boolean eliminaPersona(String dni) {
    for (int i = 0; i < personList.size(); i++) {
      if (personList.get(i).getDni().equals(dni)) { // encontrada la persona a eliminar
        personList.remove(i);
        return true;
      }
    }
    return false; // no encontrado
  }

  @Override
  public String toString() {
    return personList.toString();
  }
}
