package ch14;

import ch09.AutoCloseObj;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 파일의 끝까지 한 바이트씩 자료 읽기
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println(i + " = " + (char) i);
            }
            System.out.println("end");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
