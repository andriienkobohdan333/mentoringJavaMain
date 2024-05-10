package com.mentorship.patterns.builder;

public abstract class CarBuilderPattern {
    protected Car car = new Car();
    public abstract void buildCarBody();
    public abstract void buildEngine();
    public abstract void buildWheels();

    public Car getCar() {
        return car;
    }
}
