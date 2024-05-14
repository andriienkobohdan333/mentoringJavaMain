package com.mentorship.patterns.builderPattern.model;

import java.util.UUID;

public class Engine {
    private final UUID id;
    private final String name;
    private final EngineType engineType;
    private final int power;
    private final ProducerCoutry producer;

    public Engine(String name, EngineType engineType, int power, ProducerCoutry producer){
        this.id = UUID.randomUUID();
        this.name = name;
        this.engineType = engineType;
        this.power = power;
        this.producer = producer;
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
