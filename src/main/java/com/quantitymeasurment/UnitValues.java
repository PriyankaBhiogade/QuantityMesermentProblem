package com.quantitymeasurment;

public enum UnitValues {
    FEET(12.0), INCH(1.0), YARD(36.0) ,CENTIMETER(0.4);

    public final double measurementValue;

    UnitValues(Double measurementValue) {
        this.measurementValue = measurementValue;
    }

    public static Boolean conversion(QuantityMeasurement val1, QuantityMeasurement val2) {
        return Double.compare((val1.value * val1.unit.measurementValue), (val2.value * val2.unit.measurementValue)) == 0;
    }

    public static Double addition(QuantityMeasurement val1, QuantityMeasurement val2) {
        return ((val1.value * val1.unit.measurementValue) + (val2.value * val2.unit.measurementValue)) ;

    }
}
