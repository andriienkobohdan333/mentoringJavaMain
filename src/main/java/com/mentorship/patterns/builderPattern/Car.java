package com.mentorship.patterns.builderPattern;

import com.mentorship.patterns.builderPattern.model.ProducerCoutry;
import com.mentorship.patterns.builderPattern.model.Engine;
import com.mentorship.patterns.builderPattern.model.Transmission;
import com.mentorship.patterns.builderPattern.model.Wheels;

import java.time.LocalDate;
import java.util.UUID;

public class Car {
    private UUID id;
    private ProducerCoutry producer;
    private String model;
    private LocalDate producedDate;
    private int mileage;
    private Engine engine;
    private Wheels wheels;
    private Transmission transmission;

    private Car(Builder builder) {
        this.id = UUID.randomUUID(); // We will generate a UUID for each new car
        this.producer = builder.producer;
        this.model = builder.model;
        this.producedDate = builder.producedDate;
        this.mileage = builder.mileage;
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.transmission = builder.transmission;
    }

    public static class Builder{
        private ProducerCoutry producer;
        private String model;
        private LocalDate producedDate;
        private int mileage;
        private Engine engine;
        private Wheels wheels;
        private Transmission transmission;

        public Builder madeBy(ProducerCoutry producer) {
            this.producer = producer;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder producedDate(LocalDate producedDate){
            this.producedDate = producedDate;
            return this;
        }

        public Builder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheels(Wheels wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
