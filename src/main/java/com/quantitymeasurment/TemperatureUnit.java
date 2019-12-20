package com.quantitymeasurment;

public enum TemperatureUnit implements IUnit {
    FAHRENHEIT(32.0), CELSIUS(1.0);

    public final double measurementValue;

    TemperatureUnit(Double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        if (this.equals(FAHRENHEIT))
            return FAHRENHEIT.measurementValue;
        return CELSIUS.measurementValue;
    }
}
