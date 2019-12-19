package com.quantitymeasurment;

public class QuantityMeasurement {

    public LengthsUnits lengthsUnits;
    public  Double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) o;
        return Double.compare(length.value, value) == 0 &&
                lengthsUnits == length.lengthsUnits;
    }

    public QuantityMeasurement(LengthsUnits lengthsUnits, Double value) {
        this.lengthsUnits = lengthsUnits;
        this.value = value;
    }

    public boolean compareLengthUnit(QuantityMeasurement that) {
        Boolean conversion = LengthsUnits.conversion(that, this);
        return conversion;
    }

    public Double additionOfLenghths(QuantityMeasurement that) {
        Double addition = LengthsUnits.addition(that, this);
        return addition;
    }
}
