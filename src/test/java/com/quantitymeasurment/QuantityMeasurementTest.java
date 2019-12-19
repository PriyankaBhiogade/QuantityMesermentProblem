package com.quantitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenValueInZeroFeetAndZeroFeet_ShouldReturnEqualValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.INCH, 0.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthsUnits.INCH, 0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroFeetAndOneFeet_ShouldReturnWrongValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenValueZeroAndNullInFeet_ShouldReturnWrongValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        Assert.assertNotEquals(feet1,null);
    }

    @Test
    public void givenTwoClassObject_WhenDifferent_ShouldReturnWrongValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenValueInZeroInchAndZeroInch_ShouldReturnEqualValue() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 0.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthsUnits.INCH, 0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenValueInZeroInchAndOneInch_ShouldReturnEqualValue() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 0.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        Assert.assertNotEquals(feet1,inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 0.0);
        boolean compareCheck = feet1.compareLengthUnit(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenNotEqual_ShouldReturnFalse() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        boolean compareCheck = feet1.compareLengthUnit(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = feet1.compareLengthUnit(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        boolean compareCheck = inch1.compareLengthUnit(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenNotEqual_ShouldReturnFalse() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = inch1.compareLengthUnit(feet1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnTrueValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 12.0);
        boolean compareCheck = feet1.compareLengthUnit(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnTrueValue() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 12.0);
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = inch1.compareLengthUnit(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrueValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 3.0);
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = feet1.compareLengthUnit(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnFalseValue() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = feet1.compareLengthUnit(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnFalseValue() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = inch1.compareLengthUnit(yard1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnTrueValue() {
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 1.0);
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 36.0);
        boolean compareCheck = yard1.compareLengthUnit(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchesAnd1Yard_ShouldReturnTrueValue() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 36.0);
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 1.0);
        boolean compareCheck = inch1.compareLengthUnit(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrueValue() {
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 1.0);
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 3.0);
        boolean compareCheck = yard1.compareLengthUnit(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd1Yard_ShouldReturnTrueValue() {
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.INCH, 12.0);
        LengthMeasurement yard2 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        boolean compareCheck = yard1.compareLengthUnit(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenValueInZeroYardAndZeroYard_ShouldReturnEqualValue() {
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.YARD, 0.0);
        LengthMeasurement yard2 = new LengthMeasurement(LengthsUnits.YARD, 0.0);
        Assert.assertEquals(yard1,yard2);
    }

    @Test
    public void givenValueIn0YardAnd1Yard_WhenWrong_ShouldReturnNotEqual() {
        LengthMeasurement yard1 = new LengthMeasurement(LengthsUnits.FEET, 0.0);
        LengthMeasurement yard2 = new LengthMeasurement(LengthsUnits.INCH, 1.0);
        Assert.assertNotEquals(yard1,yard2);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenEquals_ShouldReturnTrueValue() {
        LengthMeasurement inch = new LengthMeasurement(LengthsUnits.INCH, 2.0);
        LengthMeasurement cm = new LengthMeasurement(LengthsUnits.CENTIMETER, 5.0);
        boolean compareCheck = inch.compareLengthUnit(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inches() {
        LengthMeasurement inch1 = new LengthMeasurement(LengthsUnits.INCH, 2.0);
        LengthMeasurement inch2 = new LengthMeasurement(LengthsUnits.INCH, 2.0);
        double result = inch1.additionOfLenghths(inch2);
        Assert.assertEquals(4.0,result,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inches() {
        LengthMeasurement feet = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        LengthMeasurement inch = new LengthMeasurement(LengthsUnits.INCH, 2.0);
        double result = feet.additionOfLenghths(inch);
        Assert.assertEquals(14.0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inches() {
        LengthMeasurement feet1 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        LengthMeasurement feet2 = new LengthMeasurement(LengthsUnits.FEET, 1.0);
        double result = feet1.additionOfLenghths(feet2);
        Assert.assertEquals(24.0,result,0.0);
    }

    @Test
    public void given2InchesAndCentimeters_ShouldReturn3Inches() {
        LengthMeasurement inch = new LengthMeasurement(LengthsUnits.INCH, 2.0);
        LengthMeasurement centimeter = new LengthMeasurement(LengthsUnits.CENTIMETER, 2.5);
        double result = inch.additionOfLenghths(centimeter);
        Assert.assertEquals(3.0, result, 0.0);
    }


    @Test
    public void given1GallonAnd3Litres_WhenEquals_ShouldReturnTrue() {
        VolumeMeasurement gallon = new VolumeMeasurement(VolumesUnits.GALLON,1.0);
        VolumeMeasurement litres = new VolumeMeasurement (VolumesUnits.LITRES, 3.78);
        boolean compareCheck = gallon.compareVolumeUnits(litres);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitresAnd1000Milliliters_WhenEquals_ShouldReturnTrue() {
        VolumeMeasurement litres = new VolumeMeasurement(VolumesUnits.LITRES,1.0);
        VolumeMeasurement mL = new VolumeMeasurement (VolumesUnits.MILLILITERS,1000.0);
        boolean compareCheck = litres.compareVolumeUnits(mL);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3_78litres_ShouldReturn7_57Litres() {
       VolumeMeasurement gallon = new VolumeMeasurement(VolumesUnits.GALLON, 1.0);
        VolumeMeasurement litres = new VolumeMeasurement(VolumesUnits.LITRES, 3.78);
        double result = gallon.additionOfVolumes(litres);
        Assert.assertEquals(7.57,result,0.1);
    }

    @Test
    public void given1LitreAnd1000Milliliters_ShouldReturn2Litres() {
        VolumeMeasurement litres = new VolumeMeasurement(VolumesUnits.LITRES, 1.0);
        VolumeMeasurement ml = new VolumeMeasurement(VolumesUnits.MILLILITERS, 1000.0);
        double result = litres.additionOfVolumes(ml);
        Assert.assertEquals(2.0,result,0.0);
    }
}
