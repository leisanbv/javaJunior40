package msc.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        int a = 4, b = 4, c = 5;

        int perimeter = a + b + c;
        System.out.println(perimeter);

        boolean isosceles = a==b||b==c||c==a;
        System.out.println(isosceles);

        if (isosceles) {
            System.out.println("A triangle is isosceles");
        }
        else{
            System.out.println("A triangle isn't isosceles");
        }
    }
}

