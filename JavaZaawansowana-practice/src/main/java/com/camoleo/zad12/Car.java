package com.camoleo.zad12;

import java.util.ArrayList;
import java.util.Objects;

public class Car {

    private String name;
    private String carModel;
    private int yearOfProd;
    private String country;
    private int price;
    private Manufacturer listOfManufacturers;
    private EngineType engineTypes;

    public Car(String name, String carModel, int yearOfProd, String country, int price, Manufacturer listOfManufacturers, EngineType engineTypes) {
        this.name = name;
        this.carModel = carModel;
        this.yearOfProd = yearOfProd;
        this.country = country;
        this.price = price;
        this.listOfManufacturers = listOfManufacturers;
        this.engineTypes = engineTypes;
    }

    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public String getCountry() {
        return country;
    }

    public int getPrice() {
        return price;
    }

    //czy ten getter jest ok?
    public Manufacturer getListOfManufacturers() {
        return listOfManufacturers;
    }

    public EngineType getEngineTypes() {
        return engineTypes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setListOfManufacturers(Manufacturer listOfManufacturers) {
        this.listOfManufacturers = listOfManufacturers;
    }

    public void setEngineTypes(EngineType engineTypes) {
        this.engineTypes = engineTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProd == car.yearOfProd &&
                price == car.price &&
                Objects.equals(name, car.name) &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(country, car.country) &&
                Objects.equals(listOfManufacturers, car.listOfManufacturers) &&
                Objects.equals(engineTypes, car.engineTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, carModel, yearOfProd, country, price, listOfManufacturers, engineTypes);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", listOfManufacturers=" + listOfManufacturers +
                ", engineTypes=" + engineTypes +
                '}';
    }
}


