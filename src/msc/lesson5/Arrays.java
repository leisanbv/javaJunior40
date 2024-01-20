package msc.lesson5;

public class Arrays {
    public static void main(String[] args) {
//        int[][] arr = new int[5][5]; // empty
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == (arr.length-1)/2 && j == (arr[i].length - 1)/2) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//            System.out.println();
        int[][] arr = new int[5][5]; // empty
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //if (i <= (arr.length-1)/2) {
                // or if(i%2==0) {
                // if (i%2==0 || j%2!=0){
                if (i==j){
                    System.out.print("* ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}