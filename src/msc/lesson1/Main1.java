package msc.lesson1;

public class Main1 {
    public static void main(String[] args) {
        int money = 1000;
        int priceOfSnickers = 35;
        double priceOfCandy = 3.5;

        // приведение типа
        int countSnickersCanBuy = money / priceOfSnickers; // 28 (900 рублей)
        int restOfMoneyAfterBuyingSnickers = money % priceOfSnickers; // 1000 % 35 = 20

        int countCandyBuy = (int)(restOfMoneyAfterBuyingSnickers / priceOfCandy);

        System.out.println(countSnickersCanBuy);
        System.out.println(countCandyBuy);
    }



}
