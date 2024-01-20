package msc.lesson2;

public class Main7 {
    public static void main(String[] args) {
        // Задание: вывести на консоль цифры от -10 до 20
        for (int i = -10; i < 20; i++) {
            System.out.println(i);
        }

        // Задание: вывести на консоль цифры от 30 до 50, в обратном порядке
        for (int i = 50; i >= 30; i--) {
            System.out.println(i);
        }

        // Задание: вывести на консоль сумму четных чисел от 10 до 40
        int summ = 0;
        for (int i = 10; i <= 40; i += 2) {
            summ = summ + i;
        }
        System.out.println(summ);

        // посчитать и вывести на консоль сколько секунд в сутках
        int secondsInHour = 3600;
        int hours = 24;
        int summOfSeconds = 0;
        for (int secOfDay = 0; secOfDay <= secondsInHour * hours; secOfDay++) {
            summOfSeconds = secOfDay;
        }
        System.out.println(summOfSeconds);
    }
}
