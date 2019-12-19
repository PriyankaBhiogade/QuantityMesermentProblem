package com.quantitymeasurment;

public enum LengthsUnits implements IUnit {
    FEET(12.0), INCH(1.0), YARD(36.0) ,CENTIMETER(0.4);

    public final double measurementValue;

    LengthsUnits(Double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        return this.measurementValue;
    }
}
