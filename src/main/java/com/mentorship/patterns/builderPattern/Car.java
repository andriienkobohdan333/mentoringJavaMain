package com.mentorship.patterns.builderPattern;

import com.mentorship.patterns.builderPattern.model.ProducerCoutry;
import com.mentorship.patterns.builderPattern.model.Engine;
import com.mentorship.patterns.builderPattern.model.Transmission;
import com.mentorship.patterns.builderPattern.model.Wheels;

import java.time.LocalDate;
import java.util.UUID;

public class Car {
    private UUID id;
    private ProducerCoutry madeBy;
    private String model;
    private LocalDate producedDate;
    private int mileage;
    private Engine engine;
    private Wheels wheels;
    private Transmission transmission;
}
