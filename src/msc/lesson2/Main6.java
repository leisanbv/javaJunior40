package msc.lesson2;

public class Main6 {
    public static void main(String[] args) {
        // Задача: сколько мы заберем денег из банка,
        // если оставим 10 000 руб на 7 лет, под 9% годовых
        // помесячная капитализация

        double money = 1000000;
        int year = 5;
        int persent = 9;

        for (int month = 0; month <= year * 12; month++) {
            money = money + ((money / 100 * persent) / 12);
        }
        System.out.println(money);
    }
}
