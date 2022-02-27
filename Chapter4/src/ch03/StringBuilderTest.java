package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("java");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append("android");
        System.out.println(System.identityHashCode(buffer));
        System.out.println("buffer = " + buffer);

        java = buffer.toString();
        System.out.println("buffer = " + buffer);
        System.out.println("java = " + java);
    }
}
