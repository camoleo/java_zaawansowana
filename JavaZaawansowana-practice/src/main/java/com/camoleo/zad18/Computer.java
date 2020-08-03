package com.camoleo.zad18;

import java.util.Objects;

public class Computer {
    private String processor;
    private double ram;
    private String graphics;
    private String brandName;
    private String model;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Computer(String processor, double ram, String graphics, String brandName, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphics = graphics;
        this.brandName = brandName;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphics='" + graphics + '\'' +
                ", brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.ram, ram) == 0 &&
                Objects.equals(processor, computer.processor) &&
                Objects.equals(graphics, computer.graphics) &&
                Objects.equals(brandName, computer.brandName) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphics, brandName, model);
    }
}
