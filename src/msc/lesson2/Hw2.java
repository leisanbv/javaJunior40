package msc.lesson2;

public class Hw2 {
    public static void main(String[] args) {
        // отобразить числа от 100 до 200 которые делятся на 7
        for (int i = 100; i < 200; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
