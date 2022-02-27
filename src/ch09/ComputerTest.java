package ch09;

abstract class Computer {
    abstract void display();
    abstract void typing();

    public void turnOn() {
        System.out.println("turn on");
    }
    void turnOff() {
        System.out.println("turn off");
    }
}

class DeskTop extends Computer {

    @Override
    void display() {
        System.out.println("DeskTop display");
    }

    @Override
    void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("DeskTop turnoff");
    }
}

abstract class NoteBook extends Computer {

    @Override
    void typing() {
        System.out.println("NoteBook typing");
    }
}

class MyNoteBook extends NoteBook {

    @Override
    void display() {
        System.out.println("MyNoteBook display");
    }
}

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.turnOn();
        computer.display();
        computer.turnOff();
        computer.typing();

        NoteBook myNoteBook = new MyNoteBook();
        myNoteBook.turnOn();
        myNoteBook.typing();
        myNoteBook.display();
        myNoteBook.turnOff();
    }
}
