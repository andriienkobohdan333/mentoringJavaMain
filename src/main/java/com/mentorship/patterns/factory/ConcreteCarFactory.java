package com.mentorship.patterns.factory;

public class ConcreteCarFactory extends CarFactory {
    @Override
    public Car createCar(CarType type) {
        return switch (type) {
            case SEDAN -> new SedanCar();
            case SPORT -> new SportCar();
            case ELECTRIC -> new ElectricCar();
            case UNKNOWN -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}
