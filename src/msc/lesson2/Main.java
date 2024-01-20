package msc.lesson2;

public class Main {
    public static void main(String[] args) {
        // управляющие конструкции
        // if

        // Есть три стороны треугольника. Вывести на консоль вид треугольника.
        int a = 10;
        int b = 6;
        int c = 8;

        if (a != b && b != c && c != a){
            System.out.println("Это разносторонний треугольник");
        }

        else if (a == b && b == c && c == a){
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }

//        if ((a == b && b != c) || (a != b && b == c) || (a != b && a == c)){
//            System.out.println("Это равнобедренный треугольник");
//        }
    }
}
