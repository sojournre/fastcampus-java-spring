package ch05;

import java.util.ArrayList;
import java.util.List;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum = list.stream().mapToInt(s -> s).sum();
        System.out.println("sum = " + sum);
    }
}
