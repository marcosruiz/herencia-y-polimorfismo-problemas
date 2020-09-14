package formas;

import java.awt.*;

public class Ellipse extends Form {

  private Double longRadius;
  private Double shortRadius;

  public Ellipse(Color color, Point center, String name, Double firstRadius, Double secondRadius){
    super(color, center, name);
    setRadius(firstRadius, secondRadius);
  }

  public void setRadius(Double firstRadius, Double secondRadius){
    if(firstRadius <= secondRadius){
      this.shortRadius = firstRadius;
      this.longRadius = secondRadius;
    } else {
      this.shortRadius = secondRadius;
      this.longRadius = firstRadius;
    }
  }

  @Override
  public Double getArea() {
    return longRadius * shortRadius * Math.PI;
  }

  @Override
  public Double getPerimeter() {
    return 2 * Math.PI * Math.sqrt((longRadius* longRadius + shortRadius * shortRadius) / 2);
  }

  @Override
  public String toString() {
    return super.toString() +
        ", longRadius=" + longRadius +
        ", shortRadius=" + shortRadius;
  }
}
