package Abstrak;

public class humoBank extends abstrak {

    private double humohisob;

    public humoBank(double hisob) {
        this.humohisob = hisob;
    }

    public double getHisob() {
        return humohisob;
    }

    public void setHisob(double hisob) {
        this.humohisob = hisob;
    }

    @Override
    public String toString() {
        return "humoBank{" +
                "hisob=" + humohisob +
                '}';
    }
}
