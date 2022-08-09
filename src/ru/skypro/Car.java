package ru.skypro;

public class Car extends TransportVehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля " + this.getModelName());
    }

    @Override
    public void check() {
     checkEngine();
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        System.out.println();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель " + this.getModelName());
    }

    @Override
    public String toString() {
        return "Car " + getModelName() + ", количество колес = " + getWheelsCount();
    }

}
