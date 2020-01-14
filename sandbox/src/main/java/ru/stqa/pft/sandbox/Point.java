package ru.stqa.pft.sandbox;

class Point {
  int a;
  int b;

  public Point(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public double distance(Point p2) {
    return Math.sqrt((p2.b - p2.a) * (p2.b - p2.a) + (this.b - this.a) * (this.b - this.a));
  }

}

