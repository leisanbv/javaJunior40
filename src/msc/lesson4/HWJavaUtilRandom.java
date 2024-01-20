package msc.lesson4;

import java.util.Random;

public class HWJavaUtilRandom {
    public static void main(String[] args) {
        int [][] values = new int [50][50];
        Random random = new Random();
        for(int i=0;i< values.length;i++){
            for(int j=0;j< values[i].length;j++){
                values[i][j]= random.nextInt(200);
                System.out.print(values[i][j] + " ");

            }
            System.out.println();
        }
    }
}



