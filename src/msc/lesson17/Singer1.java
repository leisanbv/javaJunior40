package msc.lesson17;

public class Singer1 extends Thread{

    private boolean needsToStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needsToStop){
            for (int i = 0; i < 2; i++) {
                System.out.println("MI ----------");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }
            try {
                synchronized (Monitors.MICROPHONE) {
                    Monitors.MICROPHONE.wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            count++;
            if(count>4){
                needsToStop = true;
            }


        }
    }
}
