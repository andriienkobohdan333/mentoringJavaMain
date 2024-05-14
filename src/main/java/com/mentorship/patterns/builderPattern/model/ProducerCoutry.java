package com.mentorship.patterns.builderPattern.model;

public enum ProducerCoutry{
    CHINA("China"),
    FRANCE("France"),
    USA("United States of America"),
    INDIA("India"),
    GERMANY("Germany"),
    Italy("Italy"),
    BRAZIL("Brazil"),
    JAPAN("Japan");

    private final String name;

    ProducerCoutry(String name) {
        this.name = name;
    }

    public String getCountryName(){
        return name;
    }
}
