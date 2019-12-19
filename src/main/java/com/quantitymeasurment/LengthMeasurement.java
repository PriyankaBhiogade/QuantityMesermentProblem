package com.quantitymeasurment;

public class LengthMeasurement {

    public LengthsUnits lengthsUnits;
    public  Double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthMeasurement length = (LengthMeasurement) o;
        return Double.compare(length.value, value) == 0 &&
                lengthsUnits == length.lengthsUnits;
    }

    public LengthMeasurement(LengthsUnits lengthsUnits, Double value) {
        this.lengthsUnits = lengthsUnits;
        this.value = value;
    }

    public boolean compareLengthUnit(LengthMeasurement that) {
        Boolean conversion = LengthsUnits.conversion(that, this);
        return conversion;
    }

    public Double additionOfLenghths(LengthMeasurement that) {
        Double addition = LengthsUnits.addition(that, this);
        return addition;
    }
}
