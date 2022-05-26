package proect2.GenerateMap;

import proect2.AllAnimal.Animal;
import proect2.Main;

import java.util.Map;
import java.util.Random;

public class RunRun {
    public static OneMap[][] RunR(OneMap[][] oneMaps) {
        int x = 0;
        int y = 0;

        for (OneMap[] one : oneMaps) {
            for (OneMap oneOne : one) {
                for (String animal : Animal.massTest) {
                    int i = oneOne.map.get(animal).size()-1;
                    for (int t = i; t >= 0; t--) {
                        Animal any = oneOne.map.get(animal).get(t);
//                        if(any==null){
//                            System.out.println(t);
//                            System.out.println(i);
//                            System.out.println("null");
//                            System.out.println(oneOne.map.get(animal).size());
//                            try {
//                                Thread.currentThread().sleep(1000000000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
                        if (any.isRun()) {

                                // Вызываем метод которы выберет куда мы идем и насколько должен вернуть 2 координаты
                                int[] ints = anyRanSide(x, y, any);
                        if (oneMaps[ints[0]][ints[1]].map.get(animal).size()<any.getQuantityInOneCell()){
                            oneMaps[ints[0]][ints[1]].map.get(animal).add(any);
                            oneOne.map.get(animal).remove(t);
                        }

                        }
                    }
                }
                y++;
            }
            y=0;
            x++;
        }
        return oneMaps;
    }

    public static int[] anyRanSide(int x, int y, Animal any) {

        int runX = 0;
        int runY = 0;
        if (new Random().nextInt(2) == 0) {
            //гор
            if (new Random().nextInt(2) == 0) {
                //влево
                if (x == 0) {
                    runX = new Random().nextInt(any.getSpeed()); //Пойдем вправо
                    runX = runX + 1;
                } else {
                    if (x < any.getSpeed()) {

                        runX = (new Random().nextInt(any.getSpeed() - x));
                        runX = runX + 1;
                    } else {
                        runX = -(new Random().nextInt(any.getSpeed()));
                        runX = runX - 1;
                    }
                }
            } else {
                //вправо
                if (x == Main.maxI - 1) {
                    runX = -(new Random().nextInt(any.getSpeed())); //Пойдем в лево
                    runX = runX - 1;
                } else {
                    if ((Main.maxI - 1 - x) < any.getSpeed()) {
                        runX = new Random().nextInt((Main.maxI - 1 - x)); //Идем вправо но на чуть чуть
                    } else {
                        runX = new Random().nextInt(any.getSpeed());

                    }
                    runX = runX + 1;
                }
            }

        } else {
            //верт
            if (new Random().nextInt(2) == 0) {
                //Верх
                if (y == 0) {
                    runY = new Random().nextInt(any.getSpeed()); //Пойдем вниз
                    runY = runY + 1;
                } else {
                    if (y < any.getSpeed()) {
                        runY = (new Random().nextInt(any.getSpeed() - y));
                        runY = runY + 1;
                    } else {

                        runY = -(new Random().nextInt(any.getSpeed()));
                        runY = runY - 1;
                    }
                }

            } else {
                //вниз
                if (y == Main.maxJ - 1) {
                    runY = -(new Random().nextInt(any.getSpeed())); //Пойдем в верх
                    runY = runY - 1;
                } else {
                    if ((Main.maxJ-1 - y) < any.getSpeed()) {
                        runY = new Random().nextInt(Main.maxJ-1 - y); //Идем вниз но на чуть чуть
                    } else {
                        runY = new Random().nextInt(any.getSpeed());
                    }
                    runY = runY + 1;
                }

            }
        }
        int[] answer = {runX + x, runY + y};
        return answer;
    }
}
