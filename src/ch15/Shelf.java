package ch15;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    Shelf() {
        shelf = new ArrayList<>();
    }

    ArrayList<String> getShelf() {
        return shelf;
    }

    int getCount() {
        return shelf.size();
    }
}
