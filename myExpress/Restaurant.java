package myExpress;

public class Restaurant extends Cafetria {
    private int stars;
    private int vipRooms;
    private int busyVipRooms;


    public Restaurant(String name, String address, int capacity, int parking,  int stars) {
        super(name, address, capacity, parking,true);
        this.stars = stars;
    }

    public float cookTime(Food food, boolean isVip){
        float cafeteriaTime = super.cookTime(food);
        if(isVip) return (float) (cafeteriaTime * 0.8);
        return (float) (cafeteriaTime*0.90);
    }

    public int getVipRooms() {
        return vipRooms;
    }

    public void setVipRooms(int vipRooms) {
        this.vipRooms = vipRooms;
    }

    public int getBusyVipRooms() {
        return busyVipRooms;
    }

    public String bookingVipRooms(int countRooms) {
        if(vipRooms-busyVipRooms >= countRooms){
            busyVipRooms += countRooms;
            return "Buyurtma qabul qilindi!";
        }
        if(vipRooms-busyVipRooms == 0){
            return "bo'sh xonalar mavjud emas";
        }
        return String.format("Xonalar soni yetarli emas %d ta bo'sh xona bor",vipRooms-busyVipRooms);
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
