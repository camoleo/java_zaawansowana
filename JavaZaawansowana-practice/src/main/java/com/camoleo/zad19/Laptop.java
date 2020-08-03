package com.camoleo.zad19;

import com.camoleo.zad18.Computer;

import java.util.Objects;

public class Laptop extends Computer {

    private String battery;

    public Laptop(String processor, double ram, String graphics, String brandName, String model) {
        super(processor, ram, graphics, brandName, model);
    }

    @Override
    public String getProcessor() {
        return super.getProcessor();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

//    @Override
//    public int hashCode() {
//        return Objects
//    }
}