package com.mentorship.patterns.builder;

public class JeepCarBuilder extends CarBuilderPattern {
    public void buildCarBody(){
        car.addFeature("Jeep Big Body");
    }

    public void buildEngine(){
        car.addFeature("Engine: V4");
    }
    public void buildWheels(){
        car.addFeature("Wheels");
    }
}
