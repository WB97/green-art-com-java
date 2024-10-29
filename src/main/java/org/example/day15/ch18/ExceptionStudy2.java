package org.example.day15.ch18;

public class ExceptionStudy2 {
    public static void main(String[] args) throws Exception{
        int r = div(10, 0);
    }

    public static int div(int n1, int n2) throws Exception {
        try {
            return n1/n2;
        } catch (Exception e) {
            throw new InterruptedException();
        }
    }
}
