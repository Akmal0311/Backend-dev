package Thread;

public class thread {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("New Thread "+ Thread.currentThread().getName()));
        System.out.println(Thread.currentThread().getName());
        thread.start();
    }
}
