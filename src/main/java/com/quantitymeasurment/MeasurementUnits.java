package com.quantitymeasurment;

public enum MeasurementUnits {
    FEET {
        public double conversionIntoInch(double value) {
            return value * 12.0;
        }
    },
    INCH {
        public double conversionIntoInch(double value) {
            return value;
        }
    },
    YARD {
        public double conversionIntoInch(double value) {
            return value * 3 * 12;
        }
    };

    public double conversionIntoInch(double value) {
        return 0.0;
    }
}
