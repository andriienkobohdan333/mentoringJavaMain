package com.mentorship.patterns.factory;

public class SedanCar extends Car{
    @Override
    public String start() {
        return "Sedan car starts.";
    }

    @Override
    public String speedUp() {
        return "Sedan car speedUp.";
    }

    @Override
    public String stop() {
        return "Sedan car stopping.";
    }
}
