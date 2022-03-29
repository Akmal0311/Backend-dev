package Click;

import java.util.Date;

public class humo extends card implements NFS {


    public humo(String cardNumber, Date date, double balance, String type, int pinCode) {
        super(cardNumber, date, balance, type, pinCode);
    }

    @Override
    public String NFS() {
        return "HumoCard NFS chipiga ega!";
    }

}
