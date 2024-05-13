package com.mentorship.patterns.abstractfactory;

import com.mentorship.patterns.builder.Car;

public class SportsCarFactory implements CarFactory {
    @Override
    public Engine createEngine(){
        return new ElectricEngine();
    }

    @Override
    public Wheels createWheels() {
        return new SportWheels();
    }

    @Override
    public Body createBody() {
        return new SportBody();
    }
}
