package com.camoleo.zad17;

public class MeasurementConverter {
    public static void main(String[] args) {
    MeasurementConverter convert = new MeasurementConverter();
        System.out.println(convert(4,ConversionType.YARDS_TO_METERS));
    }

    public static double convert(double value, ConversionType conversionType) {
        return value * conversionType.getConverter();
    }
}

