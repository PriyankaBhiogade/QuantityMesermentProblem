package com.quantitymeasurment;

import java.util.Objects;

public class QuantityMeasurement {
    private final double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public QuantityMeasurement(double value) {
        this.value=value;
    }
}
