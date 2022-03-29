package myExpress;

public class Cafetria extends FeetPlace {
    private boolean haveparking;
    private int parking;
    private boolean haveService;
    private float ball;
    private Food[] menu;
    private String historyOfParking;



    public Cafetria(String name, String address, int capacity,  int parking, boolean haveService) {
        super(name, address, capacity);
        this.haveService = haveService;
        setParking(parking);
    }

    public float cookTime(Food food){
        float odatiyVaqt = food.getTime();
        float nagruzka = (float) (getClientCount()-1) / (float) getCapacity();
        return odatiyVaqt + nagruzka * odatiyVaqt;
    }

    public void Deletenumber(String nomer){
        historyOfParking = null;
    }

    public int getParking() {return parking;}
    public void setParking(int parking) {
        this.parking = Math.max(parking,0);
        setHaveParking(getParking()!=0);
    }

    public float getBall() {return ball;}

    public void setBall(float ball) {
        this.ball = ball;
    }

    public boolean isHaveService() {
        return haveService;
    }

    public void setHaveService(boolean haveService) {
        this.haveService = haveService;
    }

    public boolean isParking() {
        return haveparking;
    }

    public void setHaveParking(boolean parking) {
        this.haveparking = parking;
    }

    public Food[] getMenu() {
        return menu;
    }

    public void setMenu(Food[] menu) {
        this.menu = menu;
    }

    public String getHistoryOfParking() {
        return historyOfParking;
    }

    public void setHistoryOfParking(String historyOfParking) {
        this.historyOfParking = historyOfParking;
    }
}
