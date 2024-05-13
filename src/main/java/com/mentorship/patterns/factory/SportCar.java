package com.mentorship.patterns.factory;

public class SportCar extends Car{


    @Override
    public String start() {
        return "Sport car starts.";
    }

    @Override
    public String speedUp() {
        return "Sport car speedUp.";
    }

    @Override
    public String stop() {
        return "Sport car stopping.";
    }
}
