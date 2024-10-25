package org.example.day14.ch17;

public class PrinterDriver3 {
    public static void main(String[] args) {
        String myDoc = "asdasd";
        Printable prn1 = new Prn909Drv();
        prn1.print(myDoc);
    }
}

interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-090 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
}