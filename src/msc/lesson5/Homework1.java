package msc.lesson5;

public class Homework1 {
    public static void main(String[] args) {
        // 2 3 4 1 6 5 7
        int[][] values = new int[5][5];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(values[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int[][] v = new int[5][5];
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(v[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i != j) {
                    System.out.print("* ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int[][] b = new int[5][5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if ( i%2==0 || j%2==0){
                    System.out.print("* ");
                } else{
                    System.out.print(b[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int[][] c = new int[5][5];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if ( i<c.length/2){
                    System.out.print("* ");
                } else{
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 2 3 4 1 6 5 7
        int[][] d = new int[5][5];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if ( i==0 || j==0 || i-1==0 || j-5==0){
                    System.out.print("* ");
                } else{
                    System.out.print(d[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int[][] e = new int[5][5];
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                if ( i==0 || j!=0){
                    System.out.print("* ");
                } else{
                    System.out.print(e[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 4
        int[][] f = new int[5][5];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                if ( i==0 || i == f.length - 1 || j==0 || j==f[i].length-1){
                    System.out.print("* ");
                } else{
                    System.out.print(f[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 3
        int[][] g = new int[5][5];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (i==g.length/2 || j==g.length/2){
                    System.out.print("* ");
                } else{
                    System.out.print(g[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();


        // 1
        int[][] m = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i==j || i+j==m[i][j]+1){
                    System.out.print("* ");
                } else{
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }



}
