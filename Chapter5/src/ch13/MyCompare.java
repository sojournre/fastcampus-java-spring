package ch13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println("set = " + set);
    }
}
