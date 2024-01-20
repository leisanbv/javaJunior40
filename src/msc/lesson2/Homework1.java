package msc.lesson2;

public class Homework1 {
    // isosceles triangle
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 9;

        int perimeter = a + b + c;
        System.out.println(perimeter);

        boolean bol = c>a && c>b;
        System.out.println(bol);

        boolean isosceles = a == b || b == c || c == a;
        System.out.println(isosceles);

        if (isosceles) {
            System.out.println("A triangle is isosceles");
        }
        else {
            System.out.println("A triangle isn't isosceles");
        }

    }

}
