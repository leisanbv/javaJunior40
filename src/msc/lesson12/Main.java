package msc.lesson12;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 2.3, "gold", 1970);
        Coin coin2 = new Coin(10, 2.3, "gold", 1970);
        Coin coin3 = new Coin(2, 2.5, "silver", 1930);
        Coin coin4 = new Coin(5, 5.3, "bronze", 1930);
        Coin coin5 = new Coin(1, 9.3, "gold", 1997);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for(Coin c: coins){
            System.out.println(c);
        }



//        LinkedHashSet<String> strings = new LinkedHashSet<>();
//        strings.add("qqq");
//        strings.add("www");
//        strings.add("eee");
//        strings.add("eee");
//        strings.add("rrr");
//        System.out.println(strings);
    }
}
