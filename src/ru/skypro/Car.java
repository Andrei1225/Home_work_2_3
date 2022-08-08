package ru.skypro;

public class Car extends TransportVehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public String toString() {
        return "Car " + getModelName() + ", количество колес = " + getWheelsCount();
    }
}
