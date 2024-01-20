package msc.lesson7;

public class Operation {

    //** Модификаторы доступа: public - видно всем, private - виден внутри класса, напримеи Operation,
    // "" - работает на уровне пакета (в уроке 6 видно не будет
    // protected - виден внутри класса и для дочерних классов


    public String getUpperText(String str) {
        // 2-е слово - то что мы ожидаем от метода получить
        // 3-е слово - наименование
        // если ничего не нужно передать, скобки пустые
        // {} - тело

        String res = str.toUpperCase();
        return res;

    }

    public int sum(int a, int b) {
        int res = a + b;
        return res;
    }

    //void - когда не нужно ничего возвращать
    public void printText(String text){
        printError();
        System.out.println(text);

    }

    private void printError(){
        System.out.println("Error");

    }

    public static void multiply (int x, int y){
        System.out.println("Multiply = " + (x * y));
        //static = может вызываться только у типа/класса
    }

    public double divide (int z, int v){
        double dv = z*1.0/v;
        return dv;

    }

}
