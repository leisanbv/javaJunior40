package msc.lesson5;

public class TheRest {
    public static void main(String[] args) {
        int[][] h = new int[5][5];
        boolean per = true;
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                if (i+j%2==0){
                    System.out.print("* ");
                    per = false;
                } else{
                    System.out.print(h[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
