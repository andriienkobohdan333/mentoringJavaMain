package com.mentorship.patterns.abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Wheels createWheels();
    Body createBody();
}
