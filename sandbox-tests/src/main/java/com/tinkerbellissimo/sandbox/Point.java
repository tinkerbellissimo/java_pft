package com.tinkerbellissimo.sandbox;

/**
 * Created by tinkerbellissimo on 2/23/17.
 */
public class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getDistance(double x, double y) {
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }

  public double distance(Point p) {
    return getDistance(p.x, p.y);
  }
}
