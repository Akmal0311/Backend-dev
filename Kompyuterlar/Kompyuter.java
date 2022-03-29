package Kompyuterlar;

public class Kompyuter {
    private String processor;
    private Integer storage;
    private Integer ram;
    private String brand;
    private Integer cost;

    public Kompyuter(String processor, Integer storage, Integer ram, String brand, Integer cost) {
        this.processor = processor;
        this.storage = storage;
        this.ram = ram;
        this.brand = brand;
        this.cost = cost;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Kompyuter{" +
                "processor='" + processor + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
