package com.mentorship.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<String> features = new ArrayList<>();

    public void addFeature(String feature) {
        features.add(feature);
    }

    public void showFeatures() {
        System.out.println("Car features: ");
        int counter = 1;
        for(String feature: features){
            System.out.println("Feature " + counter + " : " + feature);
        }
    }

}
