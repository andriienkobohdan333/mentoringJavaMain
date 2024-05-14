package com.mentorship.patterns.builderPattern.model;

import java.util.List;

public class Wheels {
    private List<Wheel> wheelList;

    public Wheels(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }


    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }
}
