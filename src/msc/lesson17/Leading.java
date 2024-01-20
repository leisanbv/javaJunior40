package msc.lesson17;

public class Leading {

    public static void main(String[] args) {
        System.out.println("The show has begun");

        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);

        singer2.start();

        while (singer1.isAlive()){

        }
        System.out.println("The show is over");
    }
}
