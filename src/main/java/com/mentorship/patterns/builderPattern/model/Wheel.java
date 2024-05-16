package com.mentorship.patterns.builderPattern.model;

public class Wheel {
    private String brand;
    private ProducerCoutry producer;
    private double size;
    private boolean isWinter;

    private Wheel(Builder builder) {
        this.brand = builder.brand;
        this.producer = builder.producer;
        this.size = builder.size;
        this.isWinter = builder.isWinter;
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

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", producer=" + producer +
                ", size=" + size +
                ", isWinter=" + isWinter +
                '}';
    }

    public static class Builder{
        private String brand;
        private ProducerCoutry producer;
        private double size;
        private boolean isWinter;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder producer(ProducerCoutry producer) {
            this.producer = producer;
            return this;
        }

        public Builder size(double size) {
            this.size = size;
            return this;
        }

        public Builder isWinter(boolean isWinter) {
            this.isWinter = isWinter;
            return this;
        }

        public Wheel build() {
            return new Wheel(this);
        }
    }
}
