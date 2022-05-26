package proect2.GenerateMap;

import java.util.Random;

public class Grass {
   private double grass=(new Random().nextDouble())*10000 ;


    public double getGrass() {
        return grass;
    }

    public void setGrass(double grass) {
        this.grass = grass;
    }
}
