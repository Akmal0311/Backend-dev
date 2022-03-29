package NotifyAndWait;

public class Sender implements  Runnable {
    private Data data;

    public Sender(Data data){
        this.data = data;
    }

    public void run(){
        String[] packets = {"First packet","Second packet", "Third packet", "Fourth packet","End"};
        for(String packet: packets){
            data.send(packet);
        }
    }
}
