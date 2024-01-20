package msc.lesson5;

public class Blueprint {
    public static void main(String[] args) {
        String[][] grid = new String[5][5];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[i].length - 1) {
                    grid[i][j] = "* ";
                } else {
                    grid[i][j] = " ";
                }

            }
        }
        char[][] xShape = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                xShape[i][j] = ( i == j || i + j == 4 ) ? '*' : '_';
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(xShape[i][j]);
            }
            System.out.println();
        }
    }
}