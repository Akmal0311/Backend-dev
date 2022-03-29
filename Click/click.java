package Click;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class click extends clickUser{
    ArrayList<clickUser> clickUsers = new ArrayList<>();

    private double ClickBalance;

    final int com = 1;

    public click(ArrayList<clickUser> clickUsers, double clickBalance, double clickHamyon, int clickPinCode, String cardNumber, Date date, double balance, String type, int pinCode) {
        super(clickHamyon,clickPinCode,cardNumber,date,balance,type,pinCode);
        this.clickUsers = clickUsers;
        ClickBalance = clickBalance;
    }

    public ArrayList<clickUser> getClickUsers() {
        return clickUsers;
    }

    public void setClickUsers(ArrayList<clickUser> clickUsers) {
        this.clickUsers = clickUsers;
    }

    public double getClickBalance() {
        return ClickBalance;
    }

    public void setClickBalance(double clickBalance) {
        ClickBalance = clickBalance;
    }

    public int getCom() {
        return com;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        click click = (click) o;
        return Double.compare(click.ClickBalance, ClickBalance) == 0 && com == click.com && Objects.equals(clickUsers, click.clickUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clickUsers, ClickBalance, com);
    }

    @Override
    public String toString() {
        return "click{" +
                "clickUsers=" + clickUsers +
                ", ClickBalance=" + ClickBalance +
                ", com=" + com +
                '}';
    }
}
