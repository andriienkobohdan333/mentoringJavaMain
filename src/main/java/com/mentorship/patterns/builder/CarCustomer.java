package com.mentorship.patterns.builder;

public class CarCustomer {
    private CarBuilderPattern carBuilder;

    public void setCarBuilder(CarBuilderPattern carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car carConstruct() {
        carBuilder.buildCarBody();
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        return carBuilder.getCar();
    }
}
