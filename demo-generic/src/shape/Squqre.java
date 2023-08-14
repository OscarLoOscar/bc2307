package shape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import shape.Circle;
import shape.Shape;

public class Square extends Shape {

  int length;

  @Override
  public double area() {
    return Math.pow(length, length);
  }

  public static void main(String[] args) {
    Shape shape = new Circle();
    Shape shape2 = new Square();
    List<Shape> list = new ArrayList<Shape>();
    // shapes = new ArrayList<Circle>();//compile error
    List<? extends Shape> shapes = new ArrayList<>(); // compil check refer to declartion , not run time
    shapes.add(new Circle());

    List<? extends Shape> list2 = new ArrayList<Circle>();
    list2 = new ArrayList<Square>();
    // polymorphism 係data structure 上有問題
    // Arraylist同List產生 polymorphism
    List<Map<String, String>> hmap = new ArrayList<>();// 型態係arraylist
    hmap.add(new HashMap<>());// polymorphism睇最出面型態
    


  }
}
