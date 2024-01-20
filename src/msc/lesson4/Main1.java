package msc.lesson4;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        // 1min=60sec
        // 60min=360sec
        // 1 sec =1000 millis
        for(int hours=0;hours<24;hours++) {
            for (int min = 0; min < 60; min++) {
                for (int second = 0; second < 60; second++) {
                    System.out.println(hours+" hours " + min + " minutes " + second + " seconds have passed");
                    Thread.sleep(1000);
                    // чтобы убрать красную лампочку, нужно выкидывание исключений throws interrupted
                    // thread --ссылочный тип
                }
            }
        }
    }
}
