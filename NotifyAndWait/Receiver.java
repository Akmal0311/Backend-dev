package NotifyAndWait;

public class Receiver implements Runnable {
    private final Data data;

    public Receiver(Data data){
        this.data = data;
    }

    @Override
    public void run(){
        String tempPacket = data.reveive();
        while(!tempPacket.equals("End")){
            System.out.println(tempPacket);
            tempPacket = data.reveive();
        }
    }
}
