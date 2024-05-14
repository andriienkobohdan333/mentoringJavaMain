package com.mentorship.patterns.builderPattern.model;

public enum TransmissionType {
    AUTOMATIC("Automatic"),
    MANUAL("Manual"),
    CVT("Continuously Variable Transmission"),
    DUAL_CLUTCH("Dual-clutch");

    private final String type;

    TransmissionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
