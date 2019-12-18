package com.quantitymeasurment;

public class Length {

    public  MeasurementUnits unit;
    public  Double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public Length(MeasurementUnits unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        Double first = this.unit.conversionIntoInch(this.value);
        Double second = that.unit.conversionIntoInch(that.value);
        boolean result = first.equals(second);
        return result;
    }
}
