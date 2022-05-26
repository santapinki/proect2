package proect2.GenerateMap;

import proect2.AllAnimal.*;
import proect2.AllAnimal.Predat.*;
import proect2.AllAnimal.Veg.*;

import java.util.ArrayList;
import java.util.Random;

public class GenerateAnimal {
    public ArrayList<Animal> generate(Animal t) {

        Random random = new Random();
        ArrayList<Animal> answer = new ArrayList<>();
        int maxAnimal = random.nextInt(t.getQuantityInOneCell());
        int valueAnimal =choseInt(t);

        for (int i = 0; i < maxAnimal; i++) {
          answer.add( choseAnimal(valueAnimal));


        }
        return answer;
    }

    public int choseInt(Animal t) {
        if (t instanceof Bear) return 1;
        if (t instanceof Caterpillar) return 2;
        if (t instanceof Cow) return 3;
        if (t instanceof Deer) return 4;
        if (t instanceof Duck) return 5;
   //     if (t instanceof Flora) return 6;
        if (t instanceof Fox) return 7;
        if (t instanceof Goat) return 8;
        if (t instanceof Hamster) return 9;
        if (t instanceof Hare) return 10;
        if (t instanceof Horse) return 11;
        if (t instanceof Kangaroo) return 12;
        if (t instanceof Sheep) return 13;
        if (t instanceof Snake) return 14;
        if (t instanceof Wolf) return 15;
        if (t instanceof Eagle) return 16;

        return 0;
    }

    public static Animal choseAnimal(int i) {
        Animal value = switch (i) {
            case 1 -> new Bear(250,	7	,2	,38	,15);
            case 2 -> new Caterpillar(0.01,	10000,	1	,0.0025	,1);
            case 3 -> new Cow(350,	20,	1,	53,	4);
            case 4 -> new Deer(170,	41,	3	,26	,4);
            case 5 -> new Duck(1,500,1,0.15,4);
        //   case 6 -> new Flora(1,	10000,0,0,0);
            case 7 -> new Fox(4,	50,	3,	1,	8);
            case 8 -> new Goat(65,	107,	1,	10	,5);
            case 9 -> new Hamster(0.03,	10000,	1,	0.0075,	3);
            case 10 -> new Hare(3	,750,	3	,0.45,	7);
            case 11 -> new Horse(300,	23	,3	,45,	5);
            case 12 -> new Kangaroo(47,	149,	2,	7,	8);
            case 13 -> new Sheep(45	,156,	1,	7,	5);
            case 14 -> new Snake(2	,123,	1,	0.3,	15);
            case 15 -> new Wolf(50,	30,	3	,8	,10);
            case 16 -> new Eagle(6	,166,	4,	1,	5);


            default -> null;
        };
        return value;
    }


}
