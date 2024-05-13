package com.mentorship.patterns.abstractfactory;

public class SportBody implements  Body {
    @Override
    public void protect(){
        System.out.println("Sport body provides the highest level of protection.");
    }
}
