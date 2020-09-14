package formas;

import java.awt.*;

public class Square extends Rectangle {
  public Square(Color color, Point center, String name, Double side){
    super(color, center, name, side, side);
  }
}
