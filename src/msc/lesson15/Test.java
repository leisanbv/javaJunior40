package msc.lesson15;

public class Test {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();

        long time1 = System.currentTimeMillis();
        copyWithOneByte.copy("/Users/batdalovaleisan/Downloads/mysql-8.0.31-macos12-x86_64.dmg", "test1.dmg" );
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2-time1));

        CopyWithGuava copyWithGuava = new CopyWithGuava();

        long time3 = System.currentTimeMillis();
        copyWithGuava.copy("/Users/batdalovaleisan/Downloads/mysql-8.0.31-macos12-x86_64.dmg", "test2.dmg" );
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Guava: " + (time4-time3));

        CopyWithCommonIO copyWithCommonIO = new CopyWithCommonIO();

        long time5 = System.currentTimeMillis();
        copyWithCommonIO.copy("/Users/batdalovaleisan/Downloads/mysql-8.0.31-macos12-x86_64.dmg", "test2.dmg" );
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Apache: " + (time6-time5));


    }
}
