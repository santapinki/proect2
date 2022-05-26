package proect2.GenerateMap;

import proect2.AllAnimal.*;

public class StartGameMapOne {
    public static OneMap[][] bigMap;

    public static OneMap[][] MakeMap(int maxI, int maxJ) {
        bigMap = new OneMap[maxI][maxJ];
        for (int i = 0; i < maxI; i++) {
            for (int j = 0; j < maxJ; j++) {
                OneMap opt = new OneMap();
                bigMap[i][j] = opt;
            }
        }
        return bigMap;
    }
}
