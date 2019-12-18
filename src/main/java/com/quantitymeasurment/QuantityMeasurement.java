package com.quantitymeasurment;

public class QuantityMeasurement {

    public UnitValues unit;
    public  Double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public QuantityMeasurement(UnitValues unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(QuantityMeasurement that) {
        Boolean conversion = UnitValues.conversion(that, this);
        return conversion;
    }

    public Double additionOfLenghths(QuantityMeasurement that) {
        Double addition = UnitValues.addition(that,this);
        return addition;

    }
}
