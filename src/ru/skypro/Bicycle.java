package ru.skypro;

public class Bicycle extends TransportVehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда " + this.getModelName());
    }


    @Override
    public String toString() {
        return "Bicycle " + getModelName() +
                ", количество колес = " + getWheelsCount();
    }

    @Override
    public void check() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println();
    }
}
