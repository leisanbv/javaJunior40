package msc.lesson3;

public class Homework {
    public static void main(String[] args) {
        // Только четные от -100 до -50
        for (int b = -100; b < -50; b++) {
            if (b % (-2) == 0) {
                System.out.println(b);
            }
        }
        // Все числа в обратном порядке от 10 до 30
        for (int i = 30; i > 10; i--) {
            System.out.println(i);

        }
        // кол-во четных чисел от 30 до 61
        int f = 0;
        for (int k = 30; k < 61; k++) {
            if (k % 2 == 0) {
                f++;
                System.out.println((f));
            }
        }
        // Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
        for (int m = 20; m < 60; m++) {
            if (m < 30 || m > 40) {
                System.out.println(m);
            }
        }


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
        // вопрос: как вывести последнюю цифру, чтобы вышло именно общее кол-во лет?

        for (int m = 20; m < 60; m++) {
            if (m < 30 || m > 40) {
            }

        }
    }
}