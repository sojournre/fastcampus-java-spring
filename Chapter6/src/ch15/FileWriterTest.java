package ch15;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 파일에 문자 쓰기
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("writer.txt", true)) {
            fw.write("A"); // 문자 하나 출력
            char buf[] = {'B','C','D','E','F','G'};

            fw.write(buf); // 문자 배열 출력
            fw.write("hello world");
            fw.write(buf, 1, 2);
            fw.write("65");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
