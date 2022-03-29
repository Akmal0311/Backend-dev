package Thread;

import Thread.colors;

public class Oqim extends Thread{
    private final String color;

    public Oqim(String threadName, String color) {
        super(threadName);
        this.color = color;
    }
        @Override
        public void run() {
            System.out.println("Ogim boshlandi: " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.println(color + i + " " + Thread.currentThread().getName() + color);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(color + Thread.currentThread().getName() + " tugadi" + color);
        }
            public static void main (String[]args){
                Oqim oqim = new Oqim("MuhammadALini oqimi", colors.GREEN);
                oqim.setDaemon(true);
                oqim.start();

                Oqim oqim2 = new Oqim("Bekzodni oqimi", colors.RED);
                oqim2.setDaemon(false);
                oqim2.start();
                try{
                        Thread.sleep(2000);

            } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(colors.CYAN + "Main oqim tugadi" + colors.CYAN);
            }
        }