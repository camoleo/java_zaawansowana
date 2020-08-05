package com.camoleo.zad12;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int yearOfEst;
    private String country;

    public Manufacturer(String name, int yearOfEst, String country) {
        this.name = name;
        this.yearOfEst = yearOfEst;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfEst() {
        return yearOfEst;
    }

    public void setYearOfEst(int yearOfEst) {
        this.yearOfEst = yearOfEst;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEst, country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEst == that.yearOfEst &&
                Objects.equals(name, that.name) &&
                Objects.equals(country, that.country);
    }

    @Override
    public String toString() {
        return "Manufacturer1{" +
                "name='" + name + '\'' +
                ", yearOfEst=" + yearOfEst +
                ", country='" + country + '\'' +
                '}';
    }
}
