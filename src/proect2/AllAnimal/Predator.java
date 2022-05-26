package proect2.AllAnimal;

import proect2.GenerateMap.Grass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Predator extends Animal{


      public abstract void eat(Map<String, ArrayList<Animal>> animals, Grass grass);
    // Упорядочивание хищников дя пожирание одними других
 //   public final static String [] mass={"bear","wolf","fox","eagle","snake"};

}
