package msc.lesson1;

public class Main2 {
    public static void main(String[] args) {
        int widthRoom = 4;
        int longRoom = 8;
        int widthTable = 2;
        int longTable = 3;

        int perimeterRoom = widthRoom * longRoom;

        int perimeterTable = widthTable * longTable;

        int amountOfTablesInRoom = perimeterRoom / perimeterTable;
        // 5 столов
        System.out.println(amountOfTablesInRoom);
    }
}
