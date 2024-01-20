package msc.lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Water", 10);
        fridge.put("Plum", 5);
        fridge.put("Sugar", 2);

        System.out.println(fridge);
    }
}
