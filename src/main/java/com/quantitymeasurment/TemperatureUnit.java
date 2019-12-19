package com.quantitymeasurment;

public enum TemperatureUnit implements IUnit{
    FAHRENHEIT(0.0), CELSIUS(0.0);

    public final double measurementValue;

    TemperatureUnit(Double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        return this.measurementValue;
    }
}
