package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenValueInZeroFeetAndZeroFeet_ShouldReturnEqualValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET,0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroFeetAndOneFeet_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenValueZeroAndNullInFeet_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        Assert.assertNotEquals(feet1,null);
    }

    @Test
    public void givenTwoClassObject_WhenDifferent_ShouldReturnWrongValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroInchAndZeroInch_ShouldReturnEqualValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthsUnits.INCH, 0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenValueInZeroInchAndOneInch_ShouldReturnEqualValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 0.0);
        boolean compareCheck = feet1.compareUnits(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        boolean compareCheck = feet1.compareUnits(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = feet1.compareUnits(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        boolean compareCheck = inch1.compareUnits(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = inch1.compareUnits(feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnTrueValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 12.0);
        boolean compareCheck = feet1.compareUnits(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnTrueValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = inch1.compareUnits(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrueValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = feet1.compareUnits(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnFalseValue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = feet1.compareUnits(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnFalseValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = inch1.compareUnits(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnTrueValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 36.0);
        boolean compareCheck = yard1.compareUnits(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchesAnd1Yard_ShouldReturnTrueValue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = inch1.compareUnits(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrueValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 3.0);
        boolean compareCheck = yard1.compareUnits(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd1Yard_ShouldReturnTrueValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.INCH, 12.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = yard1.compareUnits(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenValueInZeroYardAndZeroYard_ShouldReturnEqualValue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(LengthsUnits.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);
    }

    @Test
    public void givenValueIn0YardAnd1Yard_WhenWrong_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(LengthsUnits.FEET, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(LengthsUnits.INCH, 1.0);
        Assert.assertNotEquals(yard1,yard2);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenEquals_ShouldReturnTrueValue() {
        QuantityMeasurement inch = new QuantityMeasurement(LengthsUnits.INCH, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(LengthsUnits.CENTIMETER, 5.0);
        Boolean compareCheck = inch.compareUnits(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inches() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthsUnits.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthsUnits.INCH, 2.0);
        double result = inch1.additionOfUnits(inch2);
        Assert.assertEquals(4.0,result,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inches() {
        QuantityMeasurement feet = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthsUnits.INCH, 2.0);
        double result = feet.additionOfUnits(inch);
        Assert.assertEquals(14.0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inches() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthsUnits.FEET, 1.0);
        double result = feet1.additionOfUnits(feet2);
        Assert.assertEquals(24.0,result,0.0);
    }

    @Test
    public void given2InchesAndCentimeters_ShouldReturn3Inches() {
        QuantityMeasurement inch = new QuantityMeasurement(LengthsUnits.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(LengthsUnits.CENTIMETER, 2.5);
        double result = inch.additionOfUnits(centimeter);
        Assert.assertEquals(3.0, result, 0.0);
    }


    @Test
    public void given1GallonAnd3Litres_WhenEquals_ShouldReturnTrue() {
        QuantityMeasurement gallon = new QuantityMeasurement(VolumesUnits.GALLON,1.0);
        QuantityMeasurement litres = new QuantityMeasurement (VolumesUnits.LITRES, 3.78);
        boolean compareCheck = gallon.compareUnits(litres);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitresAnd1000Milliliters_WhenEquals_ShouldReturnTrue() {
        QuantityMeasurement litres = new QuantityMeasurement(VolumesUnits.LITRES,1.0);
        QuantityMeasurement mL = new QuantityMeasurement (VolumesUnits.MILLILITERS,1000.0);
        boolean compareCheck = litres.compareUnits(mL);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3_78litres_ShouldReturn7_57Litres() {
        QuantityMeasurement gallon = new QuantityMeasurement(VolumesUnits.GALLON, 1.0);
        QuantityMeasurement litres = new QuantityMeasurement(VolumesUnits.LITRES, 3.78);
        double result = gallon.additionOfUnits(litres);
        Assert.assertEquals(7.57, result, 0.1);
    }

    @Test
    public void given1LitreAnd1000Milliliters_ShouldReturn2Litres() {
        QuantityMeasurement litres = new QuantityMeasurement(VolumesUnits.LITRES, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(VolumesUnits.MILLILITERS, 1000.0);
        double result = litres.additionOfUnits(ml);
        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test
    public void given1KiloGramAnd1000Grams_WhenEquals_ShouldReturnTrue() {
        QuantityMeasurement kg = new QuantityMeasurement(WeightsUnits.KILOGRAMS,1.0);
        QuantityMeasurement gram = new QuantityMeasurement (WeightsUnits.GRAMS, 1000.0);
        boolean compareCheck = kg.compareUnits(gram);
        Assert.assertTrue(compareCheck);
    }
}
