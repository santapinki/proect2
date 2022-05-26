package proect2;


import proect2.AllAnimal.Animal;
import proect2.AllAnimal.Predator;
import proect2.GenerateMap.Circle;
import proect2.GenerateMap.OneMap;
import proect2.GenerateMap.StartGameMapOne;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {
    public static  int maxI=15;
    public static  int maxJ=15;


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        OneMap[][] oneMaps = StartGameMapOne.MakeMap(maxI, maxJ);
        int i=0;
        while (true) {
            System.out.println("tik tak "+i++);
            Circle.test(oneMaps);

        }
    }
}
