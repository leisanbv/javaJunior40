package msc.lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> texts = new LinkedList<>();
//        texts.add("qqq");
//        //texts.add(3, "aaa"); IndexOutOfBoundsException
//        texts.add("fds");
//        texts.add("dfgh");
//        texts.add("343");
//        texts.add(2,"heey");
//        texts.set(3, "444");
//        System.out.println(texts.get(4));
//        texts.remove(1);
//        System.out.println(texts);
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("qwerty" + i);
        }
        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("qwerty" + i);
        }
        long time3 = System.currentTimeMillis();

        System.out.println("ArrayList add - " + (time2-time1));
        System.out.println("LinkedList add - " + (time3-time2));

        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long time4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long time5 = System.currentTimeMillis();

        System.out.println("ArrayList get - " + (time4-time3));
        System.out.println("LinkedList get - " + (time5-time4));
    }
}
