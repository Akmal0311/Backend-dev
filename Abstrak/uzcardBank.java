package Abstrak;

public class uzcardBank extends  abstrak{

    private double uzcardhisob;


    public uzcardBank(double uzcardhisob) {
        this.uzcardhisob = uzcardhisob;
    }

    public double getUzcardhisob() {
        return uzcardhisob;
    }

    public void setUzcardhisob(double uzcardhisob) {
        this.uzcardhisob = uzcardhisob;
    }

    @Override
    public String toString() {
        return "uzcardBank{" +
                "uzcardhisob=" + uzcardhisob +
                '}';
    }
}
