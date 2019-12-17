package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenValueInZeroFeetAndZeroFeet_ShouldReturnEqualValue() {
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

    @Test
    public void givenValueInZeroInchAndZeroInch_ShouldReturnEqualValue() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }
}
