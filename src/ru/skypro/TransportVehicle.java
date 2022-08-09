package ru.skypro;

public abstract class TransportVehicle {
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        if (modelName != null) {
            this.modelName = modelName;
        } else {
            throw new RuntimeException("Название не может быть null");
        }
        if (wheelsCount >= 0) {
            this.wheelsCount = wheelsCount;
        } else {
            throw new RuntimeException("Количество колес не может быть отрицательным");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();

    public abstract void check();
}
