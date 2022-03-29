package Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private String username;
    private BufferedReader reader;
    private BufferedWriter writer;

    public Client(Socket socket, String username) {
        try {
            this.socket = socket;
            this.username = username;
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("client.Client konstruktorda muammo");
            closeAll();
        }
    }

    public void write(){
        new Thread( () -> {
            try {
                writer.write(username);
                writer.newLine();
                writer.flush();
                Scanner scanner = new Scanner(System.in);
                while (socket.isConnected()){
                    String message = scanner.nextLine();
                    writer.write(message);
                    writer.newLine();
                    writer.flush();
                }
            } catch (IOException e) {
                System.out.println("write da muammo");
                closeAll();
            }
        }).start();
    }

    public void listen(){
        try {
            while (socket.isConnected()){
                String message = reader.readLine();
                System.out.println(message);
            }
        } catch (IOException e){
            System.out.println("Listenda muammo");
            closeAll();
        }
    }

    public void closeAll(){
        try {
            if (this.socket != null) socket.close();
            if (reader != null) reader.close();
            if (writer != null) writer.close();
            System.exit(0);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.3.162", 8080);
            //Runtime.getRuntime().addShutdownHook(new SockketExit(socket));
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ismingizni kiriting: ");
            Client client = new Client(socket, scanner.nextLine());
            client.write();
            client.listen();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
