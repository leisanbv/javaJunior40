package msc.lesson8;

public class Triangle {
    // ссылочные: String (array of chars), Integer, Data
    // Правило ООП инкапсуляция
    // принцип инкапсуляции - сокрытие внутренних параметров внутри класса (например, автомобиль)
    // механики и программисты знают все что внутри машины и программы
    // модификатор доступа
    private int a;
    private int b;
    private int c;

    // setA - только для установки
    public void setA(int qwe) { // пришло число через метод (сеттеры)
        if (qwe > 0) {
            this.a = qwe;
        }
    }

    public int getA() {
        return this.a;
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
            //this b - текущий треуг
            //b - приходящий
        }
    }

    public int getB() {
        return this.b;
    }

    public void setC(int c) { // пришло число через метод (сеттеры)
        if (c > 0) {
            this.c = c;
        }
    }

    public int getC() {
        return this.c;
    }

    // get и set только для параметров
    public int perimeter() {
        return a + b + c;

    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt((p) * (p - a) * (p - b) * (p - c));

    }
}