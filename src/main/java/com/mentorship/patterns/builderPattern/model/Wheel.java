package com.mentorship.patterns.builderPattern.model;

public class Wheel {
    private String brand;
    private ProducerCoutry producer;
    private double size;
    private boolean isWinter;

    public Wheel(String brand, ProducerCoutry producer, double size, boolean isWinter) {
        this.brand = brand;
        this.producer = producer;
        this.size = size;
        this.isWinter = isWinter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProducerCoutry getProducer() {
        return producer;
    }

    public void setProducer(ProducerCoutry producer) {
        this.producer = producer;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }
}
