package ch01;

class Outter2 {
    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
//                num = 200;
//                i = 100;

            }
        };
    }
}
public class AnonymousInnerTest {
    public static void main(String[] args) {

    }
}
