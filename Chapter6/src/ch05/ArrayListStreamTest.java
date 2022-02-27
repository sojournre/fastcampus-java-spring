package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//ArrayList에 문자열 자료(이름)을 넣고 이에 대한 여러 연산을 수행해보기
public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Tomas");
        stringList.add("Edward");
        stringList.add("Jack");

        Stream<String> stream = stringList.stream();
        stream.forEach(s -> System.out.println("s = " + s));
        System.out.println();

        stringList.stream().sorted().forEach(s -> System.out.println("s = " + s));
        System.out.println();
        stringList.stream().map(s -> s.length()).forEach(s -> System.out.println("s = " + s));
        System.out.println();
        stringList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println("s = " + s));
    }
}
