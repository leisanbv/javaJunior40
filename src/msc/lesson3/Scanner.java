package msc.lesson3;

public class Scanner {
    public static void main(String[] args) {
        // Даны два числа (a,b). a больше b. нужно посчитать, сколько раз нужно умножить на 2 число b чтобы тот был больше а:
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a number A ");
        System.out.println("Enter a number B ");
        int d = 0;
        for (int num1 = scanner.nextInt(), num2 = scanner.nextInt(); num1 > num2; num2 *= 2, num1++) {
            d++;
            System.out.println(d);
        }


    }
}

