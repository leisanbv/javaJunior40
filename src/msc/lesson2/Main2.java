package msc.lesson2;

public class Main2 {
    public static void main(String[] args) {

        int mark = 4;
        // 5 4 3 2 1
        switch (mark) {
            case 5:
                System.out.println("Отлично!");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 3:
                System.out.println("Удовлетворительно!");
                break;
            case 2:
                System.out.println("Ужасно!");
                break;
            default:
                System.out.println("Вранье!");
        }


    }
}
