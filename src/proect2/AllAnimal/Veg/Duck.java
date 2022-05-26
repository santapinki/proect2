package proect2.AllAnimal.Veg;

import proect2.AllAnimal.Animal;
import proect2.AllAnimal.Vegan;
import proect2.GenerateMap.Grass;
import proect2.GenerateMap.OneMap;

import java.util.*;

public class Duck extends Vegan {

    private double weight;
    private int quantityInOneCell;
    private int speed;
    private double satiety;
    private int hunger;
    private boolean readyXY;
    private boolean run;

    private final double satietyMax=0.15;
    private final int hungerMax=4;

    public Duck(int quantityInOneCell) {
        this.quantityInOneCell = quantityInOneCell;
    }

    public Duck(double weight, int quantityInOneCell, int speed, double satiety, int hunger) {
        this.weight = weight;
        this.quantityInOneCell = quantityInOneCell;
        this.speed = speed;
        this.satiety = satiety;
        this.hunger = hunger;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getQuantityInOneCell() {
        return quantityInOneCell;
    }

    public void setQuantityInOneCell(int quantityInOneCell) {
        this.quantityInOneCell = quantityInOneCell;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public double getSatiety() {
        return satiety;
    }


    @Override
    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public boolean isReadyXY() {
        return readyXY;
    }

    @Override
    public void setReadyXY(boolean readyXY) {
        this.readyXY = readyXY;
    }

    @Override
    public double getSatietyMax() {
        return satietyMax;
    }

    @Override
    public int getHungerMax() {
        return hungerMax;
    }

    @Override
    public boolean isRun() {
        return run;
    }

    @Override
    public void setRun(boolean run) {
        this.run = run;
    }



   @Override
    public void eat(Map<String, ArrayList<Animal>> animals, Grass grass) {

       // Наше фиксироване меню увы фиксированоре
       String[] menu = {"flora", "caterpillar"};
       int eatMaxProc = 0;
       double howManyEat = 0;
       // Мапа в которую будем складывать еду в которой массив больше 0
       SortedMap<Integer, String> menuChoice = new TreeMap();
       // Перебераем нашу мапу использую меню и если больще складываем общий процент
       while (true) {
           for (String s : menu) {
               // Первая всегда флора мы ее тут обрабатываем и перепрыгиваем на гусинцу
               if ((s.equals("flora"))&&(grass.getGrass()>0)){
                   eatMaxProc = eatMaxProc + 100;
                   menuChoice.put(eatMaxProc, s);
                   continue;
               }
               // Если есть гусиница обрабатываем и выпригавем
               if (animals.get(s).size() > 0) {
                   int value = switch (s) {
                       case "caterpillar" -> 90;
                       default -> 0;
                   };
                   eatMaxProc = eatMaxProc + value;
                   menuChoice.put(eatMaxProc, s);

               }
           }
           //  System.out.println(eatMaxProc);
           if (eatMaxProc == 0) { // ЕДЫ НЕТ сверху пробежались по всей еде все сложили сожрать нечего
               //         System.out.println("Еда кончилась у уток");
               break;
           }
           int i = new Random().nextInt((eatMaxProc - 1));
           String answer = new String();
        /*
      Перебераем мапу с едой
        смысл у нас есть i он рамдной но он точно не больше eatMaxProc-1
        Допустим i 5 и у нас в меню первая лиса тоесть если от 0 до 10 то мы должны получить лису
        мы берем 1 элмен у него значение key 10 value Fox
        key>i да
        answer =value;       в answer лежит лиса
        следущеие eagle key 20     он больше
         */
           for (SortedMap.Entry<Integer, String> pair : menuChoice.entrySet()) {
               int key = pair.getKey();                      //ключ
               answer = pair.getValue();                  //значение
               if (key > i) {
                   // то что мы жрем  answer
                   break;
               }
           }
       //    System.out.println(answer);
           if (answer.equals("caterpillar")) {

               for (int j = animals.get(answer).size() - 1; j > -1; j--) {

                   howManyEat = howManyEat + animals.get(answer).get(j).getWeight();
                   //         System.out.println("Волк сьел "+answer);
                   animals.get(answer).remove(j);
                   if (howManyEat > satiety) {
                       satiety = satietyMax; // Вотсоноавливаем сытость
                       hunger = hungerMax;   //Востонавлимем количество ходов
                       break;
                   }
               }
               eatMaxProc = 0; // НАДО ПЕРЕИЩИТЫВАЕМ ПРОЦЕНТЫ   howManyEat сколько то осталось
               if (satiety == satietyMax) break; //Выпригиваем целеком из массива если сыты
           } else{
              this.eat(grass);
              break;
           }

       }
   }

}