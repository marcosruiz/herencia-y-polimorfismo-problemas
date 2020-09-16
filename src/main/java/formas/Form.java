package formas;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public abstract class Form {
  protected Color color;
  protected Point center;
  protected String name;

  public Form(Color color, Point center, String name) {
    this.color = color;
    this.center = center;
    this.name = name;
  }

  @Override
  public String toString() {
    return "color={red=" + color.getRed() + ", green=" + color.getGreen() + ", blue=" + color.getBlue() + "}" +
        ", center=" + center +
        ", name='" + name + "'";
  }

  public abstract Double getArea();

  public abstract Double getPerimeter();
}
