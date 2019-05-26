//: typeinfo/toys/GenericToyTest.java
// Testing class Class.
package tpye_info.toys;


import tpye_info.*;


public class GenericToyTest {
  public static void main(String[] args) throws Exception {
    Class<FancyToy> ftClass = FancyToy.class;
    // Produces exact type:
    FancyToy fancyToy = ftClass.newInstance();
    Class<? super FancyToy> up = ftClass.getSuperclass();
    // This won't compile:
    //Class<Toy> up2 = ftClass.getSuperclass();
    // Only produces Object:
    Object obj = up.newInstance();
  }
} ///:~

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Ride {}
class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, Ride {
  FancyToy() { super(1); }
}