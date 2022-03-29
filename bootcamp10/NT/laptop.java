package bootcamp10.NT;

public class laptop {
    private String model;
    private int price;
    private String processor;
    private String videokarta;
    private int ram;
    private float storage;

    public void Forcoding(int storage, int ram){
        if(storage >= 256 && ram > 4){
            System.out.println("Laptop for coding!");
        }else{
            System.out.println("Laptop not for coding!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideokarta() {
        return videokarta;
    }

    public void setVideokarta(String videokarta) {
        this.videokarta = videokarta;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getStorage() {
        return storage;
    }

    public void setStorage(float storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", videokarta='" + videokarta + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
