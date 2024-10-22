package org.example.day11.ch14;

public class SuperSubStatic {

    public static void main(String[] args) {
        SuperCLS superCLS1 = new SuperCLS();
        SuperCLS superCLS2 = new SuperCLS();
        SubCLS subCLS1 = new SubCLS();
        subCLS1.showCount();
    }

    static class SuperCLS {

        protected static int count;

        public SuperCLS() {
            count++;
        }
    }

    static class SubCLS extends SuperCLS {
        void showCount() {
            System.out.println("count: " + count);
        }
    }
}
