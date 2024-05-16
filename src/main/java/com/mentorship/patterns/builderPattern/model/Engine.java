package com.mentorship.patterns.builderPattern.model;

import java.util.UUID;

public class Engine {
    private final UUID id;
    private final String name;
    private final EngineType engineType;
    private final int power;
    private final ProducerCoutry producer;

    public Engine(Builder builder){
        this.id = UUID.randomUUID();
        this.name = builder.name;
        this.engineType = builder.engineType;
        this.power = builder.power;
        this.producer = builder.producer;
    }

    public static class Builder{
        private String name;
        private EngineType engineType;
        private int power;
        private ProducerCoutry producer;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder engineType(EngineType engineType){
            this.engineType = engineType;
            return this;
        }

        public Builder power(int power){
            this.power = power;
            return this;
        }

        public Builder producer(ProducerCoutry producer){
            this.producer = producer;
            return this;
        }

        public Engine build() {
            return new Engine(this);
        }
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }

    public ProducerCoutry getProducer() {
        return producer;
    }
}
