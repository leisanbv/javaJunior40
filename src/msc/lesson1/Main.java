
// package - указание папки в которой мы сейчас
package msc.lesson1;

// public - открытый, общедоступный внутри всего проекта
// class - "кусочек текста (кода), который имеет одну смысловую нагрузку"
public class Main {

    // тело
    // точка начала нашей программы
    public static void main(String[] args) {
        // Есть 3 стороны треугольника: 6, 10, 7. Нужно посчитать периметр
        int a = 6;
        int b = 10;
        int c = 7;

        int perimeter = a + b + c;
        // вывод на консоль sout
        System.out.println(perimeter);

    }
}
