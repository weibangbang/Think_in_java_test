//: typeinfo/pets/ForNameCreator.java
package tpye_info.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "tpye_info.pets.Mutt",//tpye_info.pets.Mutt
    "tpye_info.pets.Pug",
    "tpye_info.pets.EgyptianMau",
    "tpye_info.pets.Manx",
    "tpye_info.pets.Cymric",
    "tpye_info.pets.Rat",
    "tpye_info.pets.Mouse",
    "tpye_info.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
