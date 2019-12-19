package com.quantitymeasurment;

public class QuantityMeasurementException extends Exception {

     ExceptionType type;

    enum ExceptionType{
        CLASS_NOT_EQUAL;
    }

    public QuantityMeasurementException(String message,ExceptionType type) {
        super(message);
        this.type = type;
    }
}
