package Socket;

import java.io.IOException;
import java.net.Socket;

public class SockketExit extends Thread{
    private final Socket socket;
    public SockketExit(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            if (socket!=null && socket.isConnected())
                socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
