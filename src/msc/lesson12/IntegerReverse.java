package msc.lesson12;

import java.util.Comparator;

public class IntegerReverse implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
