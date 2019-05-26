package tpye_info;//: typeinfo/Shapes.java
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}
class Rhomboid extends Shape {
  public String toString() { return "Rhomboid"; }
}
class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}	

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(),new Rhomboid()
    );
    for(Shape shape : shapeList)
      shape.draw();
    System.out.println("================");
    Shape s=new Rhomboid();
    Class ss=s.getClass();
    System.out.println(ss.getSimpleName());
   // ((Triangle)s).draw();
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
