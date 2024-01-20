package msc.lesson7;

public class TourUtils {
    public static void getByCountry(String country, String[][] bd) {
        for (int i = 0; i < bd.length; i++) {
            if (country.equals(bd[i][0])) {
                String res = " ";
                for (int j = 0; j < bd[i].length; j++) {
                    res = res + " " + bd[i][j];
                }
                System.out.println(res);
            }
        }
//    public static void getByPrice(int price, String[][] bd){
//        for (int i = 0; i < bd.length; i++) {
//            // class Integer
//            // from string to int (parseInt)
//            int parseInt = Integer.parseInt(bd[i][2]);
//            if (price >= parseInt) {
//                String res = " ";
//                for (int j = 0; j < bd[i].length; j++) {
//                    res = res + " " + bd[i][j];
//                    }
//                    System.out.println(res);
//                }


    }

}