package ru.skypro;

public class Truck extends TransportVehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика " + this.getModelName());
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель " + this.getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп " + this.getModelName());
    }


    @Override
    public String toString() {
        return "Truck " + getModelName() +
                ", количество колес = " + getWheelsCount();
    }

    @Override
    public void check() {
        checkEngine();
        checkTrailer();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println();
    }
}
