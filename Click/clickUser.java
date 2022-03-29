package Click;

import java.util.Date;

public class clickUser extends card{
    private double clickHamyon;
    private int clickPinCode;

    public static String transfer(double summa){

        return null;
    };

    public clickUser(double clickHamyon, int clickPinCode, String cardNumber, Date date, double balance, String type, int pinCode) {
        super(cardNumber, date, balance, type, pinCode);
        this.clickHamyon = clickHamyon;
        this.clickPinCode = clickPinCode;
    }

    public double getClickHamyon() {
        return clickHamyon;
    }

    public void setClickHamyon(double clickHamyon) {
        this.clickHamyon = clickHamyon;
    }

    public int getClickPinCode() {
        return clickPinCode;
    }

    public void setClickPinCode(int clickPinCode) {
        this.clickPinCode = clickPinCode;
    }

    @Override
    public String toString() {
        return "clickUser{" +
                "clickHamyon=" + clickHamyon +
                ", clickPinCode=" + clickPinCode +
                '}';
    }
}
