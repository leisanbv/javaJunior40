package msc.lesson3;

public class Main1 {
    public static void main(String[] args) {
        // 8 примитивныхтипов

        //массивы
        //int[] arr = new int[50];
        //           0 1 2 3 4
        //int[] list = {1, 2, 3, 4, 5};
        //for (int i = 0; i < arr.length; i++) {
        //arr[i] - i * 7;
        // 0*7, 1*7; i - новая переменная которая хранит инфу
        // в каждую переменную сохранилось
        // arr.length - сколько ячеек выделено под цифрой
        //System.out.println(arr[i]);

        //напечатать массив
        // напеч колво эл-в
        // напеч все четные
        // напеч сумму всех цифр

        int[] mass = {2, 4, 5, 45, 53, 5454, 546, 685, 932};
        for (int i = 0; i<mass.length; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("Кол-во эл-в "+mass.length);

        for (int i = 0; i<mass.length; i++) {
            if (mass[i]%2==0) {
                System.out.println(mass[i]);
            }
        }
        int acc = 0;
        //переменная которая будет собирать все в себя
        for (int i = 0; i<mass.length; i++) {
            acc = acc+mass[i];
        }
        System.out.println("Сумма всех чисел = " + acc);

        }
}
