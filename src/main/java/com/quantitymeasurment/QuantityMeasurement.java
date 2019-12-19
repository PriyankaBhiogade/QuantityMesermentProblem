package com.quantitymeasurment;

import java.util.Objects;

public class QuantityMeasurement {
    public Double value;
    public IUnit units;

    public QuantityMeasurement(IUnit unit, Double value) {
        this.value = value;
        this.units = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(units, that.units);
    }

    public Boolean compareUnits(QuantityMeasurement that) throws QuantityMeasurementException {
        if(!that.units.getClass().equals(this.units.getClass())){
            throw new QuantityMeasurementException("Class Not Equal",QuantityMeasurementException.ExceptionType.CLASS_NOT_EQUAL);
        }
        return Double.compare((this.value * this.units.conversion()), (that.value * that.units.conversion())) == 0;
    }

    public double additionOfUnits(QuantityMeasurement that) {
        return ((this.value * this.units.conversion()) + (that.value * that.units.conversion()));
    }
}
