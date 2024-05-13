package com.mentorship.patterns.factory;

public class ElectricCar extends Car{
    @Override
    public String start() {
        return "Electric car starts.";
    }

    @Override
    public String speedUp() {
        return "Electric car speedUp.";
    }

    @Override
    public String stop() {
        return "Electric car stopping.";
    }
}
