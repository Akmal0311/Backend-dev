package Thread;

public class thread1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i+ Thread.currentThread().getName());
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread.start();
        System.out.println("Run");
    }
}
