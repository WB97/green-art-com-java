package org.example.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        DBox<String, Integer> dBox = new DBox<>();
        dBox.setter("Apple", 25);
        System.out.println(dBox);
    }
}

class DBox<L, R> {
    private L left;
    private R right;

    void setter(L left, R right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("%s & %s", left, right);
    }
}
