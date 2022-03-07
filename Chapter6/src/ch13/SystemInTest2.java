package ch13;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 Enter 를 누르세요");

        int i;
        while (true) {
            try {
                if (!((i = System.in.read()) != '\n')) break;
                System.out.println((char)i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
