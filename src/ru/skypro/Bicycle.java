package ru.skypro;

public class Bicycle extends transportVehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    @Override
    public String toString() {
        return "Bicycle " + getModelName() +
                ", количество колес = " + getWheelsCount();
    }
}
