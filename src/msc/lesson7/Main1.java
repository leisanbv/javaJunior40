package msc.lesson7;

public class Main1 {
    public static void main(String[] args) {
        String[][] bd =
                { //database
                        {"Russia", "Moscow", "50000", "3 stars", "Train", "Breakfast"},
                        {"Russia", "Sochi", "90000", "4 stars", "Train", "Breakfast Dinner"},
                        {"Egypt", "Caire", "150000", "5 stars", "Plane", "Breakfast"},
                        {"Turkey", "Marmaris", "70000", "3 stars", "Plane", "Breakfast"},
                        {"Turkey", "Alania", "250000", "5 stars", "Plane", "All inclusive"},
                        {"Greece", "Athenes", "130000", "4 stars", "Plane", "Breakfast"},
                };

        TourUtils.getByCountry("Turkey",bd);
//        TurUtils.getByPrice(130000,bd);
//        TurUtils.getByStars(4,bd); // не ниже 4 звезд
        TourLoop.getByStars(4, bd);


    }

}
