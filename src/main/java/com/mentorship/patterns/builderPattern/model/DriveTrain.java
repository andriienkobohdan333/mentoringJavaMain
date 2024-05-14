package com.mentorship.patterns.builderPattern.model;

public enum DriveTrain {
    FWD("Front-Wheel Drive"),
    RWD("Rear-Wheel Drive"),
    AWD("All-Wheel Drive");

    private final String desc;

    DriveTrain (String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
