package msc.lesson1;

public class Main3 {
    public static void main(String[] args) {
        int targetMoney = 10000;
        int moneyDay = 2;
        int dayOfYears = 365;

        int amountTuesday = dayOfYears / 7;
        int numberOfDaysNeed = targetMoney / moneyDay;
        double numberOfYears = (double) numberOfDaysNeed / amountTuesday;
        System.out.println(numberOfYears);
    }

}
