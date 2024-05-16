package com.mentorship.patterns.builderPattern.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Wheels {
    private List<Wheel> wheelList;

    public Wheels(Builder builder) {
        this.wheelList = builder.wheelList;
    }


    public List<Wheel> getWheelList() {
        return wheelList;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "wheelList=" + wheelList.stream()
                .map(Wheel::toString)
                .collect(Collectors.joining(", ")) +
                '}';
    }

    public static class Builder {
       private List<Wheel> wheelList = new ArrayList<>();

       public Builder addWheel(Wheel wheel){
           this.wheelList.add(wheel);
           return this;
       }

       public Builder addWheels(List<Wheel> wheels){
           this.wheelList.addAll(wheels);
           return this;
       }

       public Wheels build() {
           return new Wheels(this);
       }

   }
}
