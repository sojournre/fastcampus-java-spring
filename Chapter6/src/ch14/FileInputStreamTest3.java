package ch14;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 파일에서 바이트 배열로 자료 읽기 (배열에 남아있는 자료가 있을 수 있음에 유의)
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input.txt")) {
            byte[] bs = new byte[10];
            int i;
            while ((i = fis.read(bs, 1, 8)) != -1) {
                /*for (byte b : bs) {
                    System.out.print((char) b);
                }*/
                for (int j = 0; j < i; j++) {
                    System.out.print((char) bs[j]);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
            System.out.println("end");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
