package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenAValueInFeet_WhenEqualToFeet_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(0.0);
        QuantityMeasurement feet2 = new  QuantityMeasurement(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroFeetAndOneFeet_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(1.0);
        Assert.assertNotEquals(feet1,feet2);
    }
}
