package overrides;

import java.util.Objects;

public class Point4 {
  private int x;
  private int y;

  public Point4(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Point4))
      return false;
    Point4 point = (Point4) o;
    // return point.x == (this.x) && point.y == (this.y);
    return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);
  }

  public static void main(String[] args) {
    Point4 p1 = new Point4(1, 1);
    Point4 p2 = new Point4(1, 1);
    Point4 p3 = new Point4(1, 2);
    System.out.println(p1 == p2);
    System.out.println(p1 == p3);
    System.out.println(p2 == p3);
  }
}
