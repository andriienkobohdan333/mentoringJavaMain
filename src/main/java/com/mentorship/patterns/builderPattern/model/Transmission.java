package com.mentorship.patterns.builderPattern.model;

public class Transmission {
    private TransmissionType type;
    private int numberOfGears;
    private boolean isManual;
    private DriveTrain driveTrain;
    private ProducerCoutry producer;

    private Transmission(Builder builder){
        this.type = builder.type;
        this.numberOfGears = builder.numberOfGears;
        this.isManual = builder.isManual;
        this.driveTrain = builder.driveTrain;
        this.producer = builder.producer;

    }

    public TransmissionType getType() {
        return type;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public boolean getIsManual() {
        return isManual;
    }

    public DriveTrain getDriveTrain() {
        return driveTrain;
    }

    public ProducerCoutry getProducer() {
        return producer;
    }

    public static class Builder{
        private TransmissionType type;
        private int numberOfGears;
        private boolean isManual;
        private DriveTrain driveTrain;
        private ProducerCoutry producer;

        public Builder type(TransmissionType type) {
            this.type = type;
            return this;
        }

        public Builder numberOfGears(int numberOfGears) {
            this.numberOfGears = numberOfGears;
            return this;
        }

        public Builder isManual(boolean isManual){
            this.isManual = isManual;
            return this;
        }

        public Builder driveTrain(DriveTrain driveTrain){
            this.driveTrain = driveTrain;
            return this;
        }

        public Builder producerCountry(ProducerCoutry producer){
            this.producer = producer;
            return this;
        }

        public Transmission build() {
            return new Transmission(this);
        }
    }
}
