package msc.lesson5;

public class Homework {
    public static void main(String[] args) {
        // 2 3 4 1 6 5 7
        // 4
        int[][] s = new int[5][5];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (i%2==0 || j%2==0){
                    System.out.print("* ");
                } else{
                    System.out.print(s[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //4
        //-1 ставим потому что начин-ся с нуля
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
            for (int j = m[i].length-1; j > 0; j--) {
                if (i==j){
                    System.out.print("* ");
                } else{
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 1
        int[][] h = new int[5][5];
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                if (i+j==h.length-1){
                    System.out.print("* ");
                } else{
                    System.out.print(h[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 2
        int[][] x = new int[5][5];
        boolean per = true;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (per){
                    System.out.print("* ");
                    per = false;
                } else{
                    System.out.print(x[i][j] + " ");
                    per = true;
                }
            }
            System.out.println();
        }
        System.out.println();

        //2
        int[][] z = new int[5][5];
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                if (i+j%2==0){
                    System.out.print("* ");
                    per = false;
                } else{
                    System.out.print(z[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //5
        int[][] o = new int[5][5];
        int a= o.length/2; //2
        int b = o.length/2;
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o[i].length; j++) {
                if (j<=a&&j>=b){
                    System.out.print("* ");
                    per = false;
                } else{
                    System.out.print(o[i][j] + " ");
                }
            }
            if(i<o.length/2){
            a++;
            b--;}
            else{
                a--;
                b++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
