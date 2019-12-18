package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenValueInZeroFeetAndZeroFeet_ShouldReturnEqualValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.INCH, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitValues.INCH, 0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroFeetAndOneFeet_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenValueZeroAndNullInFeet_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        Assert.assertNotEquals(feet1,null);
    }

    @Test
    public void givenTwoClassObject_WhenDifferent_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroInchAndZeroInch_ShouldReturnEqualValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitValues.INCH, 0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenValueInZeroInchAndOneInch_ShouldReturnEqualValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnTrueValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnTrueValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrueValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnFalseValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnFalseValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnTrueValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchesAnd1Yard_ShouldReturnTrueValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrueValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd1Yard_ShouldReturnTrueValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.INCH, 12.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenValueInZeroYardAndZeroYard_ShouldReturnEqualValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(UnitValues.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);
    }

    @Test
    public void givenValueIn0YardAnd1Yard_WhenWrong_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitValues.FEET, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(UnitValues.INCH, 1.0);
        Assert.assertNotEquals(yard1,yard2);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrueValue() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitValues.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(UnitValues.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inches() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitValues.INCH, 2.0);
        QuantityMeasurement  inch2 = new QuantityMeasurement(UnitValues.INCH, 2.0);
        double result = inch1.additionOfLenghths(inch2);
        Assert.assertEquals(4.0,result,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inches() {
        QuantityMeasurement feet = new QuantityMeasurement(UnitValues.FEET, 1.0);
        QuantityMeasurement  inch = new QuantityMeasurement(UnitValues.INCH, 2.0);
        double result = feet.additionOfLenghths(inch);
        Assert.assertEquals(14.0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inches() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        QuantityMeasurement  feet2 = new QuantityMeasurement(UnitValues.FEET, 1.0);
        double result = feet1.additionOfLenghths(feet2);
        Assert.assertEquals(24.0,result,0.0);
    }

    @Test
    public void given2InchesAnd2_5Centimeters_ShouldReturn3Inches() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitValues.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(UnitValues.CENTIMETER, 2.5);
        double result = inch.additionOfLenghths(centimeter);
        Assert.assertEquals(3.0, result, 0.0);
    }
}
