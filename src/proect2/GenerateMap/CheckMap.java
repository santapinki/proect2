package proect2.GenerateMap;

import proect2.AllAnimal.Animal;
import java.util.ArrayList;
import java.util.Map;

import static proect2.AllAnimal.Animal.massTest;

public class CheckMap {
    public static void check(Map<String, ArrayList<Animal>> map,Double flora){





        for (String test:massTest) {
            String value = switch (test) {
                case "wolf" -> "\uD83D\uDC3A";
                case "snake" -> "\uD83D\uDC0D";
                case "fox" -> "\uD83E\uDD8A";
                case "bear"  -> "\uD83D\uDC3B";
                case "eagle"  -> "\uD83E\uDD85";
                //   case 6 -> new Flora(1,	10000,0,0,0);
                case "horse"  -> "\uD83D\uDC0E";
                case "deer"  -> "\uD83E\uDD8C";
                case "hare"  -> "\uD83D\uDC07";
                case "hamster"  -> "\uD83D\uDC39";
                case "goat"  -> "\uD83D\uDC10";
                case "sheep"  -> "\uD83D\uDC11";
                case "kangaroo"  -> "\uD83E\uDD98";
                case "cow"  -> "\uD83D\uDC2E";
                case "duck"  -> "\uD83E\uDD86";
                case "caterpillar"  -> "\uD83D\uDC1B";


                default -> null;
            };
            System.out.print(map.get(test).size()+" "+value+" ");

        }
        System.out.print ("\uD83C\uDF3F"+flora+" "+Thread.currentThread().getName());
        System.out.println();

    }
}
