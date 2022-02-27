package ch03;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> ( x>=y )?x:y;
        System.out.println("max = " + max.getMax(10, 20));
    }
}
