package msc.lesson6;

public class Homework3 {
    public static void main(String[] args) {
        //5
        int[][] o = new int[5][5];
        int a = o.length / 2; //2
        int b = o.length / 2;
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o[i].length; j++) {
                if (j <= a && j >= b) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }

            if (i < o.length / 2) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }
            System.out.println();
        }
        System.out.println();


        // lecture 6th example
        int[][] arr = new int[5][5];
        int s = arr.length / 2; //2
        int v = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j <= s && j >= v || i + j == arr.length - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            if (i < arr.length / 2) {
                s++;
                v--;
            } else {
                s--;
                v++;
            }
            System.out.println();
        }
        System.out.println();

        //6

        int[][] h = new int[5][5];
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                if (i == h.length / 2 || j == h.length / 2 || i + j == h.length - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(h[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //hourglass
        int[][] array = new int[5][5];
        int n = arr.length / 2; //2
        int p = arr.length / 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == n || j == p || i + j == array.length - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            if (i < array.length / 2) {
                s++;
                v--;
            } else {
                s--;
                v++;
            }
            System.out.println();
        }
        System.out.println();

    }


}

