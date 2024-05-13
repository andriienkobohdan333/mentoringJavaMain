package com.mentorship.patterns.factory;

public class ConcreteCarFactory extends CarFactory {
    @Override
    public Car createCar(String type) {
        return switch (type) {
            case "sedan" -> new SedanCar();
            case "sport" -> new SportCar();
            case "electric" -> new ElectricCar();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}
