package formas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point {
  Double x;
  Double y;
  public Point(){}
  public Point(Double x, Double y){
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}
