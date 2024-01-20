package msc.lesson2;

public class Homework3 {
    public static void main(String[] args) {
        int total = 5000, pizza = 700, pastry = 30, gum = 3;

        int amount1 = total / pizza;
        int remainder1 = total % pizza;
        System.out.println(amount1);
        System.out.println(remainder1);
        // Сдача с покупки 7 пицц - 100 рублей

        int amount2 = remainder1 / pastry;
        int remainder2 = remainder1 % pastry;
        System.out.println(amount2);
        System.out.println(remainder2);
        // Сдача с покупки 3 булочек - 10 рублей

        int amount3 = remainder2 / gum;
        int remainder3 = remainder2 % gum;
        System.out.println(amount3);
        System.out.println(remainder3);
        // Сдача с покупки 3 жвачек - 1 рубль
    }
}
