package ru.stqa.pft.sandbox;

public class Distance_2 {
  public static void main(String a[]) {
    Point point1 = new Point(3, 8);
    Point point2 = new Point(3, 8);
    System.out.println("Дистанция между точками А и B = " + point1.distance(point2));
  }

/*class Point {
  int a;
  int b;

  public Point(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public double distance(Point p1, Point p2) {
    return Math.sqrt((p2.b - p2.a) * (p2.b - p2.a) + (p1.b - p1.a) * (p1.b - p1.a));
  }*/
}
