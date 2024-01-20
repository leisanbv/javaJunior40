package msc.lesson10;

import java.util.ArrayList;

public class Library {
    private ArrayList<PrintedEdition> editions = new ArrayList<>();

    public void fillEditions() {
        Book book1 = new Book("Азбука", 1930, "АБВ", "Иванов", 30);
        Book book2 = new Book("Тарас Бульба", 1835, "Детское", "Гоголь", 200);
        Book book3 = new Book("Война и мир", 1867, "АБВ", "Толстой", 1300);
        Magazine magazine1 = new Magazine("Бурда", 2010, "qwerty", 11);
        Magazine magazine2 = new Magazine("Бурда", 2015, "qwerty", 20);
        editions.add(book1);
        editions.add(magazine1);
        editions.add(book2);
        editions.add(book3);
        editions.add(magazine2);
    }

    public void printAllEditions() {
        for (PrintedEdition edition : editions) {
            System.out.println(edition); // проявление полиморфизма
        }
    }

    public void printLargestBook() {
        PrintedEdition largest = new Book("Заглушка", 1990, "dfd", "fx", -1); //заглушка
        for (PrintedEdition edition : editions) {
            if (edition instanceof Book) {
                if (((Book) edition).getPages() > ((Book) largest).getPages()) {
                    largest = edition;
                }
            }
        }
        System.out.println("------- Самая толстая книга: ------- " );
        System.out.println(largest);
    }


}
