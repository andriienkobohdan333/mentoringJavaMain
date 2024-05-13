package com.mentorship.patterns.abstractfactory;

public class SportWheels implements Wheels {
    @Override
    public void rotate(){
        System.out.println("This car uses sport wheels.");
    }
}
