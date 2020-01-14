package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
  public void testArea() {
    Point point1 = new Point(3, 8);
    Point point2 = new Point(3, 8);
    Assert.assertEquals(point1.distance(point2), 7.0710678118654755);
  }

  @Test
  public void testArea1() {
    Point point1 = new Point(3, 8);
    Point point2 = new Point(3, 8);
    point1.a = 9;
    point1.b = 9;
    point2.a = 5;
    point2.b = 10;
    Assert.assertEquals(point1.distance(point2), 5.0);
  }

  @Test
  public void testArea2() {
    Point point1 = new Point(3, 8);
    Point point2 = new Point(3, 8);
    point1.a = 5;
    point1.b = 9;
    point2.a = 6;
    point2.b = 10;
    Assert.assertEquals(point1.distance(point2), 5.656854249492381);
  }

}