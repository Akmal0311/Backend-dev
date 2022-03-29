package Express;

public class FeetPlace {
    private String name;
    private String address;
    private int capacity;
    private int clientCount;

    public FeetPlace(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getClientCount() {
        return clientCount;
    }

    public String addClient(int clientCount) {
        if(clientCount+this.clientCount > capacity){
            return String.format("Joylar soni yetarli emas! %d ta joy bor xolos",capacity-this.clientCount);
        }else {
            this.clientCount+=clientCount;
            return "Xush kelibsiz!";
        }
    }
}
