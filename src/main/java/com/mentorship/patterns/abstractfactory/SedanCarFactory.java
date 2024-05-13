package com.mentorship.patterns.abstractfactory;

public class SedanCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new GasEngine();
    }

    @Override
    public Wheels createWheels() {
        return new BasicWheels();
    }

    @Override
    public Body createBody() {
        return new SedanBody();
    }
}
