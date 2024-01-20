package msc.lesson7;

public class TourLoop {

    //напечатать Туры по количеству звезд и выше
    //TurUtils.getByStars(4, bd);

    public static void getByStars(int star, String[][] bd) {

        for (int i = 0; i < bd.length; i++) {
            char turn = bd[i][3].charAt(0);
            int intgr = Integer.parseInt(String.valueOf(turn));
            if (star<=intgr) {
                String res = " ";
                for (int j = 0; j < bd[i].length; j++) {
                    res = res + " " + bd[i][j];
                    System.out.println(res);
                }
                System.out.println();
            }

        }

    }
}
