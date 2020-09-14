package formas;

import java.awt.*;

public class Circle extends Ellipse{

  public Circle(Color color, Point center, String name, Double radius){
    super(color, center, name, radius, radius);
  }
}
