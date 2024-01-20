package msc.lesson2;

public class Heron {
    public static void main(String[] args) {
        // написать программу которая найдет площади треугольника по 3м сторонам.(Формула Герона)
        int a = 4, b = 6, c = 8;
        int s = (a+b+c)/2;
        int area = s * (s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(area));

    }
}
