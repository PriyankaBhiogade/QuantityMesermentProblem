package com.quantitymeasurment;

public enum VolumesUnits {

    GALLON(3.78),LITRES(1),MILLILITERS(0.001);

    public final double measurementValue;

    VolumesUnits(double measurementValue) {
        this.measurementValue = measurementValue;
    }



    public static Boolean conversion(VolumeMeasurement val1, VolumeMeasurement val2) {
        return Double.compare((val1.value * val1.volumeUnits.measurementValue), (val2.value * val2.volumeUnits.measurementValue)) == 0;
    }
}
