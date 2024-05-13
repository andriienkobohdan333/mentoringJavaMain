package com.mentorship.patterns.abstractfactory;

public class SedanBody implements Body{
    @Override
    public void protect(){
        System.out.println("Sedan body provides high level of protection.");
    }
}
