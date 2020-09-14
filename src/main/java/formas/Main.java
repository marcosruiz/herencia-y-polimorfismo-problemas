package formas;

import java.awt.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    point1();
    System.out.println();
    point5();
  }

  public static void point1() {
    Rectangle rectangle = new Rectangle(Color.black, new Point(1.2, 1.2), "rectangle", 2.2, 1.2);
    System.out.println(rectangle.toString());
  }

  public static void point5() {
    Rectangle rectangle = new Rectangle(Color.BLACK, new Point(1.2, 1.2), "rectangle", 2.2, 1.2);
    Circle circle = new Circle(Color.BLUE, new Point(1.5, -1.2), "cicle", 1.2);
    Ellipse ellipse = new Ellipse(Color.GRAY, new Point(15.0, -12.0), "ellipse", 1.2, 1.65);
    Square square = new Square(Color.PINK, new Point(0.0, 0.0), "square", 45.0);

    ArrayList<Form> formArrayList = new ArrayList<>();
    formArrayList.add(rectangle);
    formArrayList.add(circle);
    formArrayList.add(ellipse);
    formArrayList.add(square);

    for(Form form: formArrayList){
      System.out.println(form.toString() + ", area=" + form.getArea() + ", perimeter=" + form.getPerimeter());
    }
  }
}
