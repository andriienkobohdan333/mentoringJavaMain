package com.mentorship.patterns.abstractfactory;

public class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Electric engine just have started.");
    }
}
