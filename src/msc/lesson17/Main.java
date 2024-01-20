package msc.lesson17;

public class Main {

    public static void main(String[] args) {
        Thread.currentThread().setName("Main");


        MyThread myThread = new MyThread();
        myThread.setName("Betty");
        myThread.start();

        Thread thread2 = new Thread(new MyThread2());
        thread2.setName("Waiter");
        thread2.start();

        for(int i = 0; i < 10; i++){
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
