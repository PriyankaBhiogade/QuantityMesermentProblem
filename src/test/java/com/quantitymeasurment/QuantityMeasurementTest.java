package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenAValueInFeet_WhenEqualToFeet_ShouldReturnTrue() {
        QuantityMeasurement measurement = new QuantityMeasurement(0.0);
        QuantityMeasurement measurement1 = new  QuantityMeasurement(0.0);
        Assert.assertEquals(measurement,measurement1);
    }
}
