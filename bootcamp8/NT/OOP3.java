package bootcamp8.NT;

import java.util.Objects;

public class OOP3 {
    private String brand;
    private String model;
    private double cost;
    private String processor;
    private int ram;
    private long storage;

    public OOP3(String brand, String model, double cost, String processor, int ram, long storage) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(long storage) {
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public long getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "OOP3{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OOP3 oop3 = (OOP3) o;
        return Double.compare(oop3.cost, cost) == 0 && ram == oop3.ram && storage == oop3.storage && Objects.equals(brand, oop3.brand) && Objects.equals(model, oop3.model) && Objects.equals(processor, oop3.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, cost, processor, ram, storage);
    }
}
