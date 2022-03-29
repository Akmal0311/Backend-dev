package Click;

import java.util.Date;

public class card {
    private String cardNumber;
    private Date date;
    private double balance;
    private String type;
    private int pinCode;

    public card(String cardNumber, Date date, double balance, String type, int pinCode) {
        this.cardNumber = cardNumber;
        this.date = date;
        this.balance = balance;
        this.type = type;
        this.pinCode = pinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", date=" + date +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
