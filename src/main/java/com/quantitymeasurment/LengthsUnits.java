package com.quantitymeasurment;

public enum LengthsUnits {
    FEET(12.0), INCH(1.0), YARD(36.0) ,CENTIMETER(0.4);

    public final double measurementValue;

    LengthsUnits(Double measurementValue) {
        this.measurementValue = measurementValue;
    }

    public static Boolean conversion(LengthMeasurement val1, LengthMeasurement val2) {
        return Double.compare((val1.value * val1.lengthsUnits.measurementValue), (val2.value * val2.lengthsUnits.measurementValue)) == 0;
    }

    public static Double addition(LengthMeasurement val1, LengthMeasurement val2) {
        return ((val1.value * val1.lengthsUnits.measurementValue) + (val2.value * val2.lengthsUnits.measurementValue)) ;
    }
}
