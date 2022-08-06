package ru.skypro;

public class Truck extends transportVehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    @Override
    public String toString() {
        return "Truck " + getModelName() +
                ", количество колес = " + getWheelsCount();
    }
}
