package msc.lesson12.hw;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Kettle> kettles = new TreeSet<>();
        kettles.add(new Kettle("Bodum", "Matte Black", "Stainless Steel", 1000, 7000, 1.7));
        kettles.add(new Kettle("OXO", "Stainless Steel", "Stainless Steel", 1500, 6700, 1.0));
        kettles.add(new Kettle("Hamilton Beach", "Red", "Stainless Steel", 1500, 9000, 1.7));
        kettles.add(new Kettle("Breville", "Silver", "Brushed", 1500, 9000, 1.8));
        kettles.add(new Kettle("COSORI", "Mixed", "Stainless Steel", 1000, 7500,1.0));

        SortButtons sortButtons = new SortButtons();
        System.out.println("Сортировка от А до Я: ");
        sortButtons.sortByBrandFromTo(kettles);
        System.out.println();


    }
}
