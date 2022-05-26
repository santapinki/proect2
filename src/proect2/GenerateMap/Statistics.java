package proect2.GenerateMap;

import proect2.AllAnimal.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statistics {

    public static Map<String, Integer> nowStats = new HashMap<>();


    public static void stats(OneMap[][] oneMaps) {
        nowStats.clear();
        for (OneMap[] one : oneMaps) {
            for (OneMap oneOne : one) {
                for (String animal : Animal.massTest) {
                    if (nowStats.get(animal) == null) {
                        nowStats.put(animal, 0);
                    }
                    nowStats.put(animal, nowStats.get(animal) + oneOne.map.get(animal).size());
                }
                if (nowStats.get("Трава") == null) {
                    nowStats.put("Трава", 0);
                }
                nowStats.put("Трава", ((int) oneOne.grass.getGrass() + nowStats.get("Трава")));

            }
        }
        for (String animal : Animal.massTest) {
            System.out.print(animal + " " + nowStats.get(animal) + " ");
        }
        System.out.println("Трава" + " " + nowStats.get("Трава"));
    }
}

