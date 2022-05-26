package proect2.GenerateMap;

import proect2.AllAnimal.Animal;
import proect2.AllAnimal.Predator;
import proect2.AllAnimal.Veg.Duck;

import java.util.ArrayList;
import java.util.Map;

public class MethodEveryTik {
    /* Метод в нашей мапе удаляет хп в размере 10 процентов а также уничтожает животное которе
    голодере и нет уже очков хода
     */
    public static void minusHpAndDie(Map<String, ArrayList<Animal>> map) {
        for (String s : Animal.massA) {
            ArrayList<Animal> minusHp = map.get(s);
            int x = minusHp.size(); // Проверяем если животные в массиве что бы отнимать хп
            if (x > 0) {
                for (int j = x; j > 0; j--) {
             //       minusHp.get(j - 1).setRun(true); //--------------
                    minusHp.get(j - 1).setSatiety(minusHp.get(j - 1).getSatiety() - (minusHp.get(j - 1).getSatietyMax() / 10));
                    // Кидаем костри на Размножение!!!!!!!!!!!!!!!!!!!!!       Почему сдись а это первая секунда первоя дня хода у животного
                    minusHp.get(j - 1).reproduction(); // Тут мы выставим репродукцию в true если getSatietyMax() > getSatiety()/1.2
                    // Убиваем животное из за голода
                    if (minusHp.get(j - 1).getSatiety() <= 0) {
                        minusHp.get(j - 1).setRun(true); //Голод ноль мы готовы сваливать
                        minusHp.get(j - 1).setHunger(minusHp.get(j - 1).getHunger() - 1);
                        if (minusHp.get(j - 1).getHunger() <= 0) {
                            minusHp.remove(j - 1);
                        }

                    }


                }
            } else {
                //      System.out.println(s + " метрвы");
            }
        }

    }
    /*
    Поедаем животнре
     */
    public static void Eating(Map<String, ArrayList<Animal>> map,Grass grass) {
                            /* ЗАПУСКАЕМ ПОЕДАНИЕ У ЖИВОТНОГО
                    Метод должен получить нашу мапу и что то отуда сожрать
                    Условия поедания когда ГОЛОД меньше getSatietyMax()) / 2
                     */
        for (String s : Animal.massA) {
            ArrayList<Animal> minusHp = map.get(s);
            int x = minusHp.size(); // Проверяем если животные в массиве что бы отнимать хп
            if (x > 0) {
                for (int j = x; j > 0; j--) {

                    if (minusHp.get(j - 1).getSatiety() < (minusHp.get(j - 1).getSatietyMax()) / 2) {
                        if ((minusHp.get(j - 1) instanceof Predator) || minusHp.get(j - 1) instanceof Duck) {
                            minusHp.get(j - 1).eat(map,grass);
                        } else {
                            minusHp.get(j - 1).eat(grass);
                        }
                    }
                }
            }
        }

    }
    /*
    Выше в методе minusHpAndDie мы выставили флаг которые отвечает за размножение и проверяем кто готов к размножению и
    размножаем
     */

    public static void reproduction(Map<String, ArrayList<Animal>> map) {
        for (String xy : Animal.massA) {
            ArrayList<Animal> checkReproduction = map.get(xy);
            int t = checkReproduction.size(); // Проверяем если животные в массиве для проверки репродукции
            if (t > 0) {
                //Выесням сколько готовы к репродукции

                int y = 0;
                for (int j = t; j > 0; j--) {
                    if (checkReproduction.get(j - 1).isReadyXY()) {
                        y++;
                    }

                }
                y = y / 2;
                for (int i = 0; i < y; i++) {
                    if (checkReproduction.size() >= checkReproduction.get(0).getQuantityInOneCell()) {
                        break;
                    }
                    checkReproduction.add(GenerateAnimal.choseAnimal(new GenerateAnimal().choseInt(checkReproduction.get(0))));
                    //    System.out.println(checkReproduction.get(0).getQuantityInOneCell());

                }


            }
        }
    }
}
