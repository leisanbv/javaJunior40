package msc.lesson4;

public class Random {
    public static void main(String[] args) {
        for(int b=0;b<100;b++){
            System.out.println(Math.random());
        }

        int [][] values = new int [50][50];
        java.util.Random random = new java.util.Random();
        for(int i=0;i< values.length;i++){
            for(int j=0;j< values[i].length;j++){
                values[i][j]= random.nextInt(100);
                System.out.print(values[i][j] + " ");

            }
            System.out.println();
        }
    }
}
