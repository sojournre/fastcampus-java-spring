package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println("file pointer position " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("file pointer position " + rf.getFilePointer());
        rf.writeUTF("안녕하세요");
        System.out.println("file pointer position " + rf.getFilePointer());

        rf.seek(0);
        System.out.println("file pointer position " + rf.getFilePointer());

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("file pointer position " + rf.getFilePointer());
        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("str = " + str);
    }
}
