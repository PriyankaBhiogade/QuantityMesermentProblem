package com.quantitymeasurment;

public class Length {

    public UnitValue unit;
    public  Double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public Length(UnitValue unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        Boolean conversion = UnitValue.conversion(that, this);
        return conversion;
    }
}
