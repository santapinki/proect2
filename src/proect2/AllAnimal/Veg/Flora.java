package proect2.AllAnimal.Veg;

import proect2.AllAnimal.Animal;
import proect2.GenerateMap.Grass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Flora extends Animal {

    private double weight;
    private int quantityInOneCell;
    private int speed;
    private double satiety;
    private int hunger;
    private boolean readyXY;
    private boolean run;

    private final double satietyMax=0;
    private final int hungerMax=0;

    public Flora(int quantityInOneCell) {
        this.quantityInOneCell = quantityInOneCell;
    }

    public Flora(double weight, int quantityInOneCell, int speed, double satiety, int hunger) {
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
    public void eat(Map<String, ArrayList<Animal>> animals, Grass grass) {

    }

    @Override
    public boolean isRun() {
        return run;
    }

    @Override
    public void setRun(boolean run) {
        this.run = run;
    }

    public void eat(Grass grass){

    }


}





