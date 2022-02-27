package ch01;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;
        int sInNum = 200;

        void inTest() {
            System.out.println("num = " + num);
            System.out.println("sNum = " + sNum);
            System.out.println("inNum = " + inNum);
        }
        void sTest() {

        }
    }
    public void usingClass() {
        inClass.inTest();
    }
    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
//            num += 10; 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
        }
        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
        System.out.println();

        OutClass.InClass inClass = outClass.new InClass();
        System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
        inClass.inTest();

        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        inStaticClass.inTest();
        System.out.println();

        System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
        OutClass.InStaticClass.sTest();
    }
}
