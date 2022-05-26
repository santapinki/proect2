package proect2.AllAnimal;

import proect2.GenerateMap.Grass;
import proect2.GenerateMap.OneMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Vegan extends Animal {
    public void eat(Grass grass) {

        double howManyEat = 0;
        while (true) {
            if (howManyEat + this.getSatiety() >= this.getSatietyMax()) {
                //Востонавливаем ходбьу
                this.setSatiety(this.getSatietyMax());
                //Востонавлимем силу
                this.setHunger(this.getHungerMax());
                break;
            }

            howManyEat = this.getSatietyMax() - this.getSatiety(); //Выесням сколько нужно досожрать травы до полного насышения
// выход из поедание если травы меньше 0 НО трава будет отрицательной потомучто ниже мы ее отнимаем
//            if (grass.getGrass()<=0){
//                break;
//            }
            if (grass.getGrass() - howManyEat <= 0) {
                this.setSatiety(this.getSatiety() + grass.getGrass());
                grass.setGrass(0);
                break;
            }


            grass.setGrass(grass.getGrass() - howManyEat); // Отнимает траву от полного количества


        }

    }

    @Override
    public void eat(Map<String, ArrayList<Animal>> animals, Grass grass) {

    }

    // Упорядочивание травоядных на всякий может вобще  дя пожирание одними других
    public static final String listV[] = {"cow", "horse", "kangaroo", "deer", "sheep", "goat", "hare", "duck", "hamster", "caterpillar"};
}
