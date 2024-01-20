package msc.lesson11;

import java.util.HashSet;
import java.util.Iterator;

public class Main1 {
    //проход по коллекции


    public static void main(String[] args) {
        HashSet<String> texts = new HashSet<>();
        texts.add("aaa");
        texts.add("sss");
        texts.add("ddd");
        texts.add("aaa");
        texts.add("!!sss");
        texts.add("sdddd");

        for(Iterator<String> iterator = texts.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

    }



}
