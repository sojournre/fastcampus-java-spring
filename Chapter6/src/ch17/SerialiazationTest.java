package ch17;

import java.io.*;

public class SerialiazationTest {
    public static void main(String[] args) {
        Person personLee = new Person("Lee", "King");
        Person personKim = new Person("Kim", "Knight");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee);
            oos.writeObject(personKim);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)){
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();
            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
