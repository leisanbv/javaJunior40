package msc.lesson4;

public class HWMathRandom {
    public static void main(String[] args) {
        int [][] ars = new int [50][50];
        for(int i=0;i<ars.length;i++) {
            for (int j = 0; j < ars[i].length; j++) {
                ars[i][j] = (int) (Math.random() * 100);
                System.out.print(ars[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
