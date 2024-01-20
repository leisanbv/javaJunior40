package msc.lesson3;

public class Main {
    public static void main(String[] args) {
        //Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500;
        int year = 0;
        int months = 0;
        for (int n = 0; n < 200000; n += 9500) {
            months++;
            if (months % 12 == 0) {
                System.out.println(months);
            } else {
                year++;
            }
        }



    }
}
