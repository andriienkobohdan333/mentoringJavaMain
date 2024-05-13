package com.mentorship.patterns.abstractfactory;

public class BasicWheels implements Wheels {
    @Override
    public void rotate(){
        System.out.println("This car uses basic wheels.");
    }
}

