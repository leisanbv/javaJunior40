package msc.lesson5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] values = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = random.nextInt(100);
                System.out.print(values[i][j] + " ");

            }
            System.out.println();
        }
        // заменить все числа кратные 5 на *
        System.out.println();

//        for (int i = 0; i < values.length; i++) {
//            for (int j = 0; j < values[i].length; j++) {
//                if (values[i][j] % 5 == 0) {
//                    System.out.print("* ");
//                }else {
//                    System.out.print(values[i][j]+" ");
//                }
//            }
//        System.out.println();
//        }


//      посчитать сумму всех чисел
//        int count = 0;
//        for (int i = 0; i < values.length; i++) {
//            for (int j = 0; j < values[i].length; j++) {
//                count = count + values[i][j];
//
//            }
//        }
//        System.out.println(count);


        // посчитать сумму каждой строки
        for (int i = 0; i < values.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < values[i].length; j++) {
                rowCount = rowCount + values[i][j];
                System.out.print(values[i][j]+" ");
            }
            System.out.println("Сумма чисел = " + rowCount);
        }
        System.out.println("Конец");
    }
}
