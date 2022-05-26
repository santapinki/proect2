package proect2.AllAnimal;

import proect2.GenerateMap.Grass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Animal {
    public abstract double getWeight();
    public abstract int getQuantityInOneCell();
    public abstract void setHunger(int hunger);
    public abstract int getHunger();
    public abstract boolean isReadyXY();
    public abstract void setReadyXY(boolean readyXY);
    public abstract double getSatiety();
    public abstract void eat(Grass grass) ;
    public abstract double getSatietyMax();
    public abstract void setSatiety(double satiety);
    public abstract int getHungerMax();
    public abstract void eat(Map<String, ArrayList<Animal>> animals,Grass grass);
    public abstract boolean isRun();
    public abstract void setRun(boolean run);
    public abstract int getSpeed();

    public void reproduction() {

           if (this.getSatietyMax() > this.getSatiety()/1.2) {                                            //Насчет проверки сытости животного не уверен

               this.setReadyXY(true);
            } else {
                this.setReadyXY(false);
            }


    }

    // Для более легко перебора мапы со всеми животными там для размножения и ли обсчета голода или для движение
   // public static final String massA[]={"bear"};
   // public static final String massA[]={"bear","wolf","fox","eagle","snake"};
    public static final String massA[]={"bear","wolf","fox","eagle","snake","cow","horse","kangaroo","deer","sheep","goat","hare","duck","hamster","caterpillar"};
    public static final String massTest[]={"bear","wolf","fox","eagle","snake","cow","horse","kangaroo","deer","sheep","goat","hare","duck","hamster","caterpillar"};

}
