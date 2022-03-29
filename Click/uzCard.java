package Click;

import java.util.Date;

public class uzCard extends card implements NFS{

    public uzCard(String cardNumber, Date date, double balance, String type, int pinCode) {
        super(cardNumber, date, balance, type, pinCode);
    }

    @Override
    public String NFS() {
        return "UzCard NFS chipiga ega emas!";
    }
}
