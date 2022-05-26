package proect2.GenerateMap;

import proect2.AllAnimal.*;
import proect2.AllAnimal.Predat.*;
import proect2.AllAnimal.Veg.*;

import java.util.*;
import java.util.concurrent.Callable;

import static proect2.GenerateMap.OneMap.tikTak;

public class OneMap implements Runnable {
    Grass grass=new Grass();
    public Map<String, ArrayList<Animal>> map = new HashMap();
    {
        map.put("bear", new GenerateAnimal().generate(new Bear(7)));
        map.put("caterpillar", new GenerateAnimal().generate(new Caterpillar(10000)));
        map.put("cow", new GenerateAnimal().generate(new Cow(20)));
        map.put("deer", new GenerateAnimal().generate(new Deer(41)));
        map.put("duck", new GenerateAnimal().generate(new Duck(500)));
        map.put("eagle", new GenerateAnimal().generate(new Eagle(166)));
     //   map.put("flora", new GenerateAnimal().generate(new Flora(10000)));
        map.put("fox", new GenerateAnimal().generate(new Fox(50)));
        map.put("goat", new GenerateAnimal().generate(new Goat(107)));
        map.put("hamster", new GenerateAnimal().generate(new Hamster(10000)));
        map.put("hare", new GenerateAnimal().generate(new Hare(750)));
        map.put("kangaroo", new GenerateAnimal().generate(new Kangaroo(149)));
        map.put("sheep", new GenerateAnimal().generate(new Sheep(156)));
        map.put("snake", new GenerateAnimal().generate(new Snake(123)));
        map.put("horse", new GenerateAnimal().generate(new Horse(23)));
        map.put("wolf", new GenerateAnimal().generate(new Wolf(30)));
//        map.put("bear", new GenerateAnimal().generate(new Bear(1)));
//        map.put("caterpillar", new GenerateAnimal().generate(new Caterpillar(1)));
//        map.put("cow", new GenerateAnimal().generate(new Cow(1)));
//        map.put("deer", new GenerateAnimal().generate(new Deer(1)));
//        map.put("duck", new GenerateAnimal().generate(new Duck(5)));
//        map.put("eagle", new GenerateAnimal().generate(new Eagle(1)));
//        //   map.put("flora", new GenerateAnimal().generate(new Flora(10000)));
//        map.put("fox", new GenerateAnimal().generate(new Fox(1)));
//        map.put("goat", new GenerateAnimal().generate(new Goat(1)));
//        map.put("hamster", new GenerateAnimal().generate(new Hamster(1)));
//        map.put("hare", new GenerateAnimal().generate(new Hare(1)));
//        map.put("kangaroo", new GenerateAnimal().generate(new Kangaroo(1)));
//        map.put("sheep", new GenerateAnimal().generate(new Sheep(1)));
//        map.put("snake", new GenerateAnimal().generate(new Snake(1)));
//        map.put("horse", new GenerateAnimal().generate(new Horse(1)));
//        map.put("wolf", new GenerateAnimal().generate(new Wolf(1)));
    }

    // Естесвеное убивание уровня голода в начале цикла в се должны потерять 1 жизнь У ВСЕХ ЖИВОТНЫЪ ВСЕГДА В НАЧАЛЕ ХОДА
    public static void tikTak(Map<String, ArrayList<Animal>> map,Grass grass) {
        MethodEveryTik.minusHpAndDie(map);
        MethodEveryTik.Eating(map,grass);
        MethodEveryTik.reproduction(map);
        // Увеличиваем траву
        if (grass.getGrass()<5000){
            grass.setGrass(grass.getGrass()+500);

        }

    }

    @Override
    public void run() {
        tikTak(map,grass);
        Thread.currentThread().interrupt();
    }
}

