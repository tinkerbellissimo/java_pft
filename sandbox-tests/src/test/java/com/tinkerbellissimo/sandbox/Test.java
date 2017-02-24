package com.tinkerbellissimo.sandbox;


import org.testng.Assert;

/**
 * Created by tinkerbellissimo on 2/23/17.
 */
public class Test {

  public static void main(String[] args) {
    Point a = new Point(4, 2);
    Point b = new Point(2, 5);
    System.out.println("Distance between point a and point b is " + a.distance(b));
    Assert.assertEquals(a.distance(b), 3.605551275463989);
  }
}
