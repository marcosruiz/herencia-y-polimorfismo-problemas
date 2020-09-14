package formas;

import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;

public class RectangleTest extends TestCase {

  @Test
  public void testLongAndShortSides() {
    Rectangle rectangle = new Rectangle(Color.GRAY, new Point(1.2,1.25), "rectangle", 3.1, 3.5);
    assertEquals(3.5, rectangle.getLongSide());
    assertEquals(3.1, rectangle.getShortSide());
  }

  @Test
  public void testLongAndShortSidesWithNegative() {
    Rectangle rectangle = new Rectangle(Color.GRAY, new Point(1.2,1.25), "rectangle", 3.7, -3.2);
    assertEquals(3.7, rectangle.getLongSide());
    assertEquals(-3.2, rectangle.getShortSide());
  }

  @Test
  public void testGetArea() {
    Rectangle rectangle = new Rectangle(Color.GRAY, new Point(1.2,1.25), "rectangle", 3.0, 4.0);
    assertEquals(12.0, rectangle.getArea());
  }

  @Test
  public void testGetPerimeter() {
    Rectangle rectangle = new Rectangle(Color.GRAY, new Point(1.2,1.25), "rectangle", 3.0, 4.0);
    assertEquals(14.0, rectangle.getPerimeter());
  }
}