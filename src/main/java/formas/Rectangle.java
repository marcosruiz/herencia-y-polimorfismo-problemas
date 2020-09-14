package formas;

import java.awt.*;

public class Rectangle extends Form {
  private Double longSide;
  private Double shortSide;

  public Rectangle(Color color, Point center, String name) {
    super(color, center, name);
  }

  public Rectangle(Color color, Point center, String name, Double firstSide, Double secondSide) {
    super(color, center, name);
    setSides(firstSide, secondSide);
  }

  public void setSides(Double firstSide, Double secondSide){
    if(firstSide <= secondSide){
      this.shortSide = firstSide;
      this.longSide = secondSide;
    } else {
      this.shortSide = secondSide;
      this.longSide = firstSide;
    }
  }

  @Override
  public String toString() {
    return super.toString() +
        ", longSide=" + longSide +
        ", shortSide=" + shortSide;
  }

  public Double getArea() {
    return longSide * shortSide;
  }

  public Double getPerimeter() {
    return longSide * 2 + shortSide * 2;
  }

  public void scaleSides(Double scaleFactor) {
    longSide = longSide * scaleFactor;
    shortSide = shortSide * scaleFactor;
  }
}
